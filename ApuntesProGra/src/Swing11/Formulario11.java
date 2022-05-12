package Swing11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JSpinner.*;
import javax.swing.table.DefaultTableModel;

public class Formulario11 extends JFrame implements ActionListener {
	private Container contenedor;
	private JLabel titulo, labelNombre, labelCantidad, informacion;
	private JTextField campoNombre;
	// private JComboBox selectorCampo;
	private JSpinner cantidad;
	private JButton botonBuscar, botonReset;
	private JTable resultados;
	private JScrollPane panelScroll;
	private String[] columnas = { "Nombre", "Apellido 1", "Apellido 2", "Departamento" };

	public Formulario11() {
		super.setTitle("Instituto");
		super.setBounds(100, 100, 800, 600);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.contenedor = super.getContentPane();
		this.contenedor.setLayout(null);

		// Titulo del formulario

		this.titulo = new JLabel("Ver profesores");
		this.titulo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		this.titulo.setSize(300, 30);
		this.titulo.setLocation(100, 30);
		this.contenedor.add(this.titulo);

		// Label del campo nombre
		this.labelNombre = new JLabel("Busqueda");
		this.labelNombre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		this.labelNombre.setSize(300, 20);
		this.labelNombre.setLocation(100, 80);
		this.contenedor.add(this.labelNombre);

		// CampoNombre
		this.campoNombre = new JTextField();
		this.campoNombre.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		this.campoNombre.setSize(190, 20);
		this.campoNombre.setLocation(100, 105);

		this.contenedor.add(this.campoNombre);

		// Label select
		this.labelCantidad = new JLabel("Ordenar el campo");
		this.labelCantidad.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		this.labelCantidad.setSize(300, 20);
		this.labelCantidad.setLocation(100, 130);
		this.contenedor.add(this.labelCantidad);

		// Cantidad

		this.cantidad = new JSpinner();
		this.cantidad.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		this.cantidad.setSize(100, 20);
		this.cantidad.setLocation(100, 160);
		this.cantidad.setModel(new SpinnerNumberModel(1, 1, 10, 1)); // se determina poner el valor
																		// inicial,minimo.maximo e incremento
		this.contenedor.add(this.cantidad);

		// Boton buscar

		this.botonBuscar = new JButton("Buscar");
		this.botonBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		this.botonBuscar.setSize(100, 20);
		this.botonBuscar.setLocation(100, 180);
		this.botonBuscar.addActionListener(this);// Aqui ira el listener
		this.contenedor.add(this.botonBuscar);

		// Boton reset
		this.botonReset = new JButton("Limpiar");
		this.botonReset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		this.botonReset.setSize(95, 20);
		this.botonReset.setLocation(210, 180);
		this.botonReset.addActionListener(this);// Aqui ira el listener y lo vinculamos con el metodo
		this.contenedor.add(this.botonReset);

		// informacion
		this.informacion = new JLabel("");
		this.informacion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		this.informacion.setSize(500, 20);
		this.informacion.setLocation(100, 215);
		this.contenedor.add(this.informacion);

		// tabla resultados
		this.resultados = new JTable(new String[0][0], this.columnas);
		this.panelScroll = new JScrollPane(this.resultados);
		this.panelScroll.setBounds(25, 240, 750, 300);
		// this.panelScroll.setLocation(25, 260);
		this.panelScroll.setVisible(true);
		this.contenedor.add(this.panelScroll);

		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.botonBuscar) {
			this.buscar();
		} else if (e.getSource() == this.botonReset) {
			this.reset();
		}

	}

	private void reset() {
		this.campoNombre.setText(""); // Para limpiar como el campo es texto le pasamos un string vacio
		this.informacion.setText(""); // limpiamos el label de la informacion
		this.resultados.setModel(new DefaultTableModel(new String[0][0], this.columnas));
	}

	private void buscar() {
		String texto = this.campoNombre.getText().trim();
		String cantidad = this.cantidad.getValue().toString();
		// String orden=this.asc.isSelected()? "ASC": "DESC"; //booleano que devolvera
		// el valor

		ArrayList<Profesor> lista = DBSwing11.consulta(texto, cantidad);

		if (lista.size() > 0) {
			this.informacion.setText("Se ha encontrado " + lista.size() + " resultados!");
			this.setResultados(lista);
		} else {
			this.informacion.setText("NO SE HA ENCONTRADO RESULTADOS....");
			this.resultados.setModel(new DefaultTableModel(new String[0][0], this.columnas));
		}

	}

	private void setResultados(ArrayList<Profesor> lista) {
		String[][] datos = new String[lista.size()][4];
		for (int i = 0; i < lista.size(); i++) {
			datos[i][0] = lista.get(i).getNombre();
			datos[i][1] = lista.get(i).getApellido1();
			datos[i][2] = lista.get(i).getApellido2();
			datos[i][3] = lista.get(i).getDepartamento();
		}
		this.resultados.setModel(new DefaultTableModel(datos, this.columnas));		//añadir a la tabla de los resultados

	}

}
