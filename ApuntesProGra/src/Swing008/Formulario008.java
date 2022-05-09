package Swing008;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Swing06.DatabaseSwing;

public class Formulario008 extends JFrame implements ActionListener {

	private Container contenedor;
	private JLabel titulo, labelNombre, informacion;
	private JTextField campoNombre;
	private JRadioButton uno, todos;
	private JButton botonBuscar, botonReset;
	private JTable resultados; // obtendremos el resultado de la consulta
	private String[] columnas = { "ID", "Nombre", "Email", "Telefono" };

	public Formulario008() {
		super.setTitle("Agenda -Nuevo Contacto");
		super.setBounds(100, 100, 600, 500);
		super.setResizable(false);// Que no se pueda redimensionar
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);// Para que se cierre la ventanita que se desplega arriba

		this.contenedor = super.getContentPane();
		this.contenedor.setLayout(null);

		// Titulo del formulario

		this.titulo = new JLabel("Nuevo contacto");
		this.titulo.setFont(new Font("Arial", Font.PLAIN, 30));
		this.titulo.setSize(300, 30);
		this.titulo.setLocation(100, 30);
		this.contenedor.add(this.titulo); // Titulo metemos dentro del contenedor

		// Label del campo nombre
		this.labelNombre = new JLabel("Nombre");
		this.labelNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelNombre.setSize(100, 20);
		this.labelNombre.setLocation(100, 80);
		this.contenedor.add(this.labelNombre);

		// Campo nombre
		this.campoNombre = new JTextField();
		this.campoNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		this.campoNombre.setSize(190, 20);
		this.campoNombre.setLocation(100, 105);
		this.contenedor.add(this.campoNombre);

		// RadioButtons

		this.uno = new JRadioButton("Al menos uno", true);
		this.uno.setSize(130, 20);
		this.uno.setLocation(100, 125);
		this.todos = new JRadioButton("Todos", false);
		this.todos.setSize(70, 20);
		this.todos.setLocation(100, 145);

		// Grupo de botones

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(this.uno);
		grupo.add(this.todos);
		this.contenedor.add(this.uno);
		this.contenedor.add(this.todos);

		// Botones

		this.botonBuscar = new JButton("Buscar");
		this.botonBuscar.setFont(new Font("Arial", Font.PLAIN, 10));
		this.botonBuscar.setSize(100, 20);
		this.botonBuscar.setLocation(100, 175);
		this.botonBuscar.addActionListener(this);// Aqui ira el listener
		this.contenedor.add(this.botonBuscar);

		this.botonReset = new JButton("Limpiar");
		this.botonReset.setFont(new Font("Arial", Font.PLAIN, 10));
		this.botonReset.setSize(100, 20);
		this.botonReset.setLocation(210, 175);
		this.botonReset.addActionListener(this);// Aqui ira el listener y lo vinculamos con el metodo
		this.contenedor.add(this.botonReset);

		// Label informacion

		this.informacion = new JLabel("");
		this.informacion.setFont(new Font("Arial", Font.PLAIN, 20));
		this.informacion.setSize(500, 20);
		this.informacion.setLocation(100, 200);
		this.contenedor.add(this.informacion);

		// tabla resultados
		this.resultados = new JTable(new String[0][0], this.columnas);
		this.resultados.setBounds(100, 230, 450, 250);
		this.resultados.setVisible(true);
		this.contenedor.add(this.resultados);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.botonBuscar || e.getSource() == this.campoNombre) {
			this.buscar();
		} else if (e.getSource() == this.botonReset) {
			this.reset();
		}

	}

	private void reset() {
		this.campoNombre.setText(""); // Para limpiar como el campo es texto le pasamos un string vacio
		this.informacion.setText("");
		this.resultados.setModel(new DefaultTableModel(new String[0][0], this.columnas));
	}

	private void buscar() {
		String operador = "";
		if (this.uno.isSelected()) {
			operador = "OR";
		} else if (this.todos.isSelected()) {
			operador = "AND";
		}
		// llama a base de datos pasando el valor del campo nombre

		ArrayList<Contacto> lista = DatabaseSwing008.consulta(this.campoNombre.getText().trim(), operador);
		if (lista.size() > 0) {
			this.informacion.setText("Se han encontrado " + lista.size() + "resultados");
			this.establecerResultados(lista);
		} else {
			this.informacion.setText("No se han encontrado resultados");

		}

	}

	private void establecerResultados(ArrayList<Contacto> lista) {
		String[][] datos = new String[lista.size()][4];

		for (int i = 0; i < datos.length; i++) {
			datos[i][0] = lista.get(i).getId() + " ";
			datos[i][1] = lista.get(i).getNombre();
			datos[i][2] = lista.get(i).getEmail();
			datos[i][2] = lista.get(i).getTelefono();
		}

		this.resultados.setModel(new DefaultTableModel(datos, this.columnas));
	}

}
