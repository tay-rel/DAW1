package Swing12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Formulario12 extends JFrame implements ActionListener {

	private Container contenedor;
	private JLabel titulo, labelBusqueda, informacion;
	private JTextField campoBusqueda;
	private JButton botonBuscar, botonReset, botonSiguiente, botonAnterior;
	private JTable resultados;
	private JScrollPane panelScroll;
	private String[] columnas = { "Nombre", "Apellido 1", "Apellido 2", "Departamento" };
	private int offset = 0;

	public Formulario12() {
		super.setTitle("Instituto");
		super.setBounds(100, 100, 800, 600);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando se cierra la ventana tambein se cierra el programa

		this.contenedor = super.getContentPane();
		this.contenedor.setLayout(null);

		// Titulo del formulario

		this.titulo = new JLabel("Ver profesores");
		this.titulo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		this.titulo.setSize(300, 30);
		this.titulo.setLocation(100, 30);
		this.contenedor.add(this.titulo);

		// Label del campo nombre
		this.labelBusqueda = new JLabel("Busqueda");
		this.labelBusqueda.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		this.labelBusqueda.setSize(200, 20);
		this.labelBusqueda.setLocation(100, 100);
		this.contenedor.add(this.labelBusqueda);

		// CampoNombre
		this.campoBusqueda = new JTextField();
		this.campoBusqueda.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		this.campoBusqueda.setSize(200, 20);
		this.campoBusqueda.setLocation(100, 125);
		this.contenedor.add(this.campoBusqueda);

		// Boton buscar

		this.botonBuscar = new JButton("Buscar");
		this.botonBuscar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		this.botonBuscar.setSize(100, 20);
		this.botonBuscar.setLocation(100, 160);
		this.botonBuscar.addActionListener(this);// Aqui ira el listener
		this.contenedor.add(this.botonBuscar);

		// Boton reset
		this.botonReset = new JButton("Limpiar");
		this.botonReset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		this.botonReset.setSize(100, 20);
		this.botonReset.setLocation(210, 160);
		this.botonReset.addActionListener(this);// Aqui ira el listener y lo vinculamos con el metodo
		this.contenedor.add(this.botonReset);

		// Boton anterior

		this.botonAnterior = new JButton("Anteriores 5");
		this.botonAnterior.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		this.botonAnterior.setSize(120, 20);
		this.botonAnterior.setLocation(450, 190);
		this.botonAnterior.addActionListener(this);
		this.botonAnterior.setVisible(false);
		this.contenedor.add(this.botonAnterior);
		// Boton siguiente

		this.botonSiguiente = new JButton("Siguientes 5");
		this.botonSiguiente.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		this.botonSiguiente.setSize(120, 20);
		this.botonSiguiente.setLocation(570, 190);
		this.botonSiguiente.addActionListener(this);//
		this.botonSiguiente.setVisible(false);
		this.contenedor.add(this.botonSiguiente);

		// informacion
		this.informacion = new JLabel("");
		this.informacion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		this.informacion.setSize(500, 20);
		this.informacion.setLocation(100, 215);
		this.contenedor.add(this.informacion);

		// tabla resultados
		this.resultados = new JTable(new String[0][0], this.columnas);
		this.panelScroll = new JScrollPane(this.resultados);
		// this.panelScroll.setBounds(25, 240, 750, 300);
		this.panelScroll.setSize(750, 300);
		this.panelScroll.setLocation(25, 260);
		this.contenedor.add(this.panelScroll);

		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.botonBuscar) {
			this.offset = 0;
			this.buscar();
		} else if (e.getSource() == this.botonReset) {
			this.reset();
		} else if (e.getSource() == this.botonAnterior) {
			this.offset -= 5;
			if (this.offset <= 0) { // se oculta el boton cuando llegue a cero
				this.botonAnterior.setVisible(false);
			}
			this.buscar();
		} else if (e.getSource() == this.botonSiguiente) {
			this.offset += 5;
			this.botonSiguiente.setVisible(true);
			this.botonAnterior.setVisible(true);
			this.buscar();
		}

	}

	private void reset() {
		this.campoBusqueda.setText(""); // Para limpiar como el campo es texto le pasamos un string vacio
		this.informacion.setText(""); // limpiamos el label de la informacion
		this.resultados.setModel(new DefaultTableModel(new String[0][0], this.columnas));
		this.botonSiguiente.setVisible(false);
		this.botonAnterior.setVisible(false);
	}

	private void buscar() {

		String texto = this.campoBusqueda.getText().trim();

		ArrayList<Profesor> lista = DBSwing12.consulta(texto, this.offset);

		if (lista.size() > 0) {
			this.informacion.setText("Se ha encontrado " + lista.size() + " resultados!");
			this.botonSiguiente.setVisible(true);
			this.setResultados(lista);
			if (lista.size() < 5 || DBSwing12.consulta(texto, this.offset + 5).size() == 0) {
				this.botonSiguiente.setVisible(false);
			}
		} else {
			this.informacion.setText("NO SE HA ENCONTRADO RESULTADOS....");
			this.resultados.setModel(new DefaultTableModel(new String[0][0], this.columnas));
			this.botonAnterior.setVisible(false);
			this.botonSiguiente.setVisible(false);
		}

	}

	private void setResultados(ArrayList<Profesor> lista) {
		String[][] datos = new String[lista.size()][4]; // tiene tantas filas como elementos tenga lista
		for (int i = 0; i < lista.size(); i++) {
			datos[i][0] = lista.get(i).getNombre();
			datos[i][1] = lista.get(i).getApellido1();
			datos[i][2] = lista.get(i).getApellido2();
			datos[i][3] = lista.get(i).getDepartamento();
		}
		this.resultados.setModel(new DefaultTableModel(datos, this.columnas)); // añadir a la tabla de los resultados

	}

}
