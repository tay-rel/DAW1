package Swing09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

public class Formulario09 extends JFrame implements ActionListener {
	private Container contenedor;
	private JLabel titulo, labelNombre, labelSelectorCampo, informacion;
	private JTextField campoNombre;
	private JComboBox selectorCampo;
	private JTable resultados;
	private JButton botonBuscar, botonReset;
	private String[] columnas = { "NRE", "Nombre", "Apellido 1", "Apellido 2", "DNI", "Email" };

	public Formulario09() {
		super.setTitle("Instituto");
		super.setBounds(100, 100, 800, 600);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.contenedor = super.getContentPane();
		this.contenedor.setLayout(null);

		// Titulo del formulario

		this.titulo = new JLabel("Ver alumnos");
		this.titulo.setFont(new Font("Arial", Font.PLAIN, 30));
		this.titulo.setSize(300, 30);
		this.titulo.setLocation(100, 30);
		this.contenedor.add(this.titulo);

		// Label del campo nombre
		this.labelNombre = new JLabel("Buscar por nombre o apellidos");
		this.labelNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelNombre.setSize(300, 20);
		this.labelNombre.setLocation(100, 80);
		this.contenedor.add(this.labelNombre);

		// CampoNombre
		this.campoNombre = new JTextField();
		this.campoNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		this.campoNombre.setSize(190, 20);
		this.campoNombre.setLocation(100, 105);
		this.contenedor.add(this.campoNombre);

		// Label select
		this.labelSelectorCampo = new JLabel("Ordenar el campo");
		this.labelSelectorCampo.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelSelectorCampo.setSize(300, 20);
		this.labelSelectorCampo.setLocation(100, 130);
		this.contenedor.add(this.labelSelectorCampo);

		// SElector ordenar por campo

		this.selectorCampo = new JComboBox();
		this.selectorCampo.setFont(new Font("Arial", Font.PLAIN, 10));
		this.selectorCampo.setSize(200, 20);
		this.selectorCampo.setLocation(100, 155);
		this.selectorCampo.addItem("nre");
		this.selectorCampo.addItem("nombre");
		this.selectorCampo.addItem("apellido1");
		this.selectorCampo.addItem("apellido2");
		this.selectorCampo.addItem("dni");
		this.selectorCampo.addItem("email");
		this.contenedor.add(this.selectorCampo);

		// Boton buscar

		this.botonBuscar = new JButton("Buscar");
		this.botonBuscar.setFont(new Font("Arial", Font.PLAIN, 15));
		this.botonBuscar.setSize(95, 20);
		this.botonBuscar.setLocation(100, 180);
		this.botonBuscar.addActionListener(this);// Aqui ira el listener
		this.contenedor.add(this.botonBuscar);

		// Boton reset
		this.botonReset = new JButton("Limpiar");
		this.botonReset.setFont(new Font("Arial", Font.PLAIN, 15));
		this.botonReset.setSize(95, 20);
		this.botonReset.setLocation(210, 180);
		this.botonReset.addActionListener(this);// Aqui ira el listener y lo vinculamos con el metodo
		this.contenedor.add(this.botonReset);

		// informacion
		this.informacion = new JLabel("");
		this.informacion.setFont(new Font("Arial", Font.PLAIN, 20));
		this.informacion.setSize(500, 20);
		this.informacion.setLocation(100, 215);
		this.contenedor.add(this.informacion);

		// tabla resultados
		this.resultados = new JTable(new String[0][0], this.columnas);
		this.resultados.setBounds(100, 240, 750, 300);
		this.resultados.setVisible(true);
		this.contenedor.add(this.resultados);

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
		this.informacion.setText("");
		this.resultados.setModel(new DefaultTableModel(new String[0][0], this.columnas));
	}

	private void buscar() {
		String texto = this.campoNombre.getText().trim();
		String campo = this.selectorCampo.getSelectedItem().toString();
		// llamada a base de datos
		
		ArrayList<Alumno> lista=DBSwing09.consulta(texto, campo);
		if(lista.size()>0) {
			this.informacion.setText("Se ha encontrado "+lista.size()+" resultados!");
			this.establecerResultados(lista);
		}else {
			this.informacion.setText("NO SE HA ENCONTRADO RESULTADOS....");
			this.resultados.setModel(new DefaultTableModel(new String[0][0], this.columnas));
		}

	}
	
	private void establecerResultados(ArrayList<Alumno> lista) {
		String[][] datos = new String[lista.size()][6];
		for (int i = 0; i < lista.size(); i++) {
			datos[i][0]=lista.get(i).getNre();
			datos[i][1]=lista.get(i).getNombre();
			datos[i][2]=lista.get(i).getApellido1();
			datos[i][3]=lista.get(i).getApellido2();
			datos[i][4]=lista.get(i).getDni();
			datos[i][5]=lista.get(i).getEmail();
		}
		this.resultados.setModel(new DefaultTableModel(datos,this.columnas));
		
	}

}
