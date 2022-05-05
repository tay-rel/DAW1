package Swing06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Para dar funcionalidad a los botones se debe implementar ActionListener que es una interfaz

public class Formulario06 extends JFrame implements ActionListener {

	private Container contenedor;
	private JLabel titulo, labelNombre, labelApellidos, labelEmail, labelTelefono, informacion;
	private JTextField campoNombre, campoApellidos, campoEmail, campoTelefono;
	private JButton botonEnviar, botonReset;

	public Formulario06() {
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
		this.labelNombre = new JLabel("Nombre *");
		this.labelNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelNombre.setSize(100, 20);
		this.labelNombre.setLocation(100, 100);
		this.contenedor.add(this.labelNombre);

		// Campo nombre
		this.campoNombre = new JTextField();
		this.campoNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		this.campoNombre.setSize(190, 20);
		this.campoNombre.setLocation(100, 125);
		this.contenedor.add(this.campoNombre);

		// Label del campo apellidos

		this.labelApellidos = new JLabel("Apellidos *");
		this.labelApellidos.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelApellidos.setSize(100, 20);
		this.labelApellidos.setLocation(100, 155);
		this.contenedor.add(this.labelApellidos);

		// Campo apellidos

		this.campoApellidos = new JTextField();
		this.campoApellidos.setFont(new Font("Arial", Font.PLAIN, 15));
		this.campoApellidos.setSize(200, 20);
		this.campoApellidos.setLocation(100, 180);
		this.contenedor.add(this.campoApellidos);

		// Label email

		this.labelEmail = new JLabel("Email");
		this.labelEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		this.labelEmail.setSize(100, 20);
		this.labelEmail.setLocation(100, 200);
		this.contenedor.add(this.labelEmail);

		this.campoEmail = new JTextField();
		this.campoEmail.setFont(new Font("Arial", Font.PLAIN, 15));
		this.campoEmail.setSize(200, 20);
		this.campoEmail.setLocation(100, 230);
		this.contenedor.add(this.campoEmail);

		// Label telefono

		this.labelTelefono = new JLabel("Telefono");
		this.labelTelefono.setFont(new Font("Arial", Font.PLAIN, 15));
		this.labelTelefono.setSize(100, 20);
		this.labelTelefono.setLocation(100, 260);
		this.contenedor.add(this.labelTelefono);

		this.campoTelefono = new JTextField();
		this.campoTelefono.setFont(new Font("Arial", Font.PLAIN, 15));
		this.campoTelefono.setSize(200, 20);
		this.campoTelefono.setLocation(100, 280);
		this.contenedor.add(this.campoTelefono);

		// Botones

		this.botonEnviar = new JButton("Guardar");
		this.botonEnviar.setFont(new Font("Arial", Font.PLAIN, 10));
		this.botonEnviar.setSize(100, 20);
		this.botonEnviar.setLocation(100, 325);
		this.botonEnviar.addActionListener(this);// Aqui ira el listener
		this.contenedor.add(this.botonEnviar);

		this.botonReset = new JButton("Limpiar");
		this.botonReset.setFont(new Font("Arial", Font.PLAIN, 10));
		this.botonReset.setSize(100, 20);
		this.botonReset.setLocation(210, 325);
		this.botonReset.addActionListener(this);// Aqui ira el listener y lo vinculamos con el metodo
		this.contenedor.add(this.botonReset);

		// Label informacion

		this.informacion = new JLabel("");
		this.informacion.setFont(new Font("Arial", Font.PLAIN, 10));
		this.informacion.setSize(500, 20);
		this.informacion.setLocation(100, 360);
		this.contenedor.add(this.informacion);

		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.botonEnviar) {
			this.enviar();
		} else if (e.getSource() == this.botonReset) {
			this.reset();
		}

	}

	private void reset() {
		this.campoNombre.setText(""); // Para limpiar como el campo es texto le pasamos un string vacio
		this.campoApellidos.setText("");
		this.campoEmail.setText("");
		this.campoTelefono.setText("");
		this.informacion.setText("");
	}

	private void enviar() {
		if (this.campoNombre.getText().trim().length() > 0 && this.campoApellidos.getText().trim().length() > 0) {
			// llamar a base de datos
			boolean resultado = DatabaseSwing.guardarContacto(
					this.campoNombre.getText().trim() + " " + this.campoApellidos.getText().trim(), this.campoEmail.getText().trim(),
					this.campoTelefono.getText().trim());
				if (resultado) {
					this.reset();
					this.informacion.setText("Exito");
				} else {
					this.informacion.setText("Fallo");
				}
				
			
		} else {
			this.informacion.setText("El nombre y apellido son campos obligatorios");
		}
	}

}
