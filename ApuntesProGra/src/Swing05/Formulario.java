package Swing05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Formulario extends JFrame implements ActionListener {

	private Container contenedor;
	private JLabel titulo, labelnombre, labelapellidos, infromacion;
	private JTextField campoNombre, campoApellidos;
	private JButton botonEnviar, botonReset;
	private JTextArea resultado;

	public Formulario() throws HeadlessException {
		super.setTitle("Formulario de prueba");// Titulo
		super.setBounds(200, 100, 600, 500);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Le decimos al cosntructor

		this.contenedor = super.getContentPane();
		this.contenedor.setLayout(null);
		// Titutlo del formulario
		this.titulo = new JLabel("Formulario de prueba");
		this.titulo.setFont(new Font("Times new Roman", Font.PLAIN, 30));
		this.titulo.setSize(300, 30);// Para el titulo , es el tamaño
		this.titulo.setLocation(100, 30);
		this.contenedor.add(this.titulo);

		// Nombre titulo y campo
		this.labelnombre = new JLabel("Nombre: ");
		this.labelnombre.setFont(new Font("Times new Roman", Font.PLAIN, 20));
		this.labelnombre.setSize(100, 20);// Para el titulo , es el tamaño
		this.labelnombre.setLocation(100, 100);
		this.contenedor.add(this.labelnombre);

		this.campoNombre = new JTextField();
		this.campoNombre.setFont(new Font("Times new Roman", Font.PLAIN, 20));
		this.campoNombre.setSize(100, 20);
		this.campoNombre.setLocation(175, 100);
		this.contenedor.add(this.campoNombre);

		// Apellido y campo
		this.labelapellidos = new JLabel("Apellido: ");
		this.labelapellidos.setFont(new Font("Times new Roman", Font.PLAIN, 20));
		this.labelapellidos.setSize(100, 120);// Para el titulo , es el tamaño
		this.labelapellidos.setLocation(100, 100);
		this.contenedor.add(this.labelapellidos);

		this.campoApellidos = new JTextField();
		this.campoApellidos.setFont(new Font("Times new Roman", Font.PLAIN, 20));
		this.campoApellidos.setSize(100, 20);
		this.campoApellidos.setLocation(180, 150);
		this.contenedor.add(this.campoApellidos);

		// Boton enviar
		this.botonEnviar = new JButton("Enviar");
		this.botonEnviar.setFont(new Font("Times new Roman", Font.PLAIN, 20));
		this.botonEnviar.setSize(100, 20);
		this.botonEnviar.setLocation(100, 230);
		// aqui listener
		 this.botonEnviar.addActionListener(this);
		this.contenedor.add(this.botonEnviar);

		// Boton Reset

		this.botonReset = new JButton("Reset");
		this.botonReset.setFont(new Font("Times new Roman", Font.PLAIN, 20));
		this.botonReset.setSize(100, 20);
		this.botonReset.setLocation(250, 230);
		// aqui listener
		this.botonReset.addActionListener(this);
		this.contenedor.add(this.botonReset);

		// lABEL CON INFORMACION

		this.infromacion = new JLabel(" ");
		this.infromacion.setFont(new Font("Times new Roman", Font.PLAIN, 20));
		this.infromacion.setSize(250, 25);
		this.infromacion.setLocation(100, 270);
		this.contenedor.add(this.infromacion);

		// Resultado
		this.resultado = new JTextArea();
		this.resultado.setFont(new Font("Times new Roman", Font.PLAIN, 20));
		this.resultado.setSize(500, 75);
		this.resultado.setLocation(100, 310);
		this.resultado.setLineWrap(false);
		this.resultado.setEditable(false);
		this.resultado.setVisible(false);
		this.contenedor.add(resultado);

		super.setVisible(true);

	}

	public void enviar() {
		if (this.campoNombre.getText().length() > 0 && this.campoApellidos.getText().length() > 0) {
			this.infromacion.setText("Formulario enviado con exito!");
			String texto = "Nombre: " + this.campoNombre.getText() + "\nApellidos: " + this.campoApellidos.getText();
			this.resultado.setText(texto);
			this.resultado.setVisible(true);
		} else {
			this.infromacion.setText("El nombre y apellido son obligatorios");
		}

	}

	public void reset() {
		this.campoNombre.setText("");
		this.campoApellidos.setText("");
		this.infromacion.setText("");
		this.resultado.setText("");
		this.resultado.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.botonEnviar) {
			// Enviar->Mostrar los datos
			this.enviar();

		} else if (e.getSource() == this.botonReset) {
			// limpiar
			this.reset();
		}

	}

}
