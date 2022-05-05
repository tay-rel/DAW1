package Swing08;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {

	private Container contenedor;
	private JLabel titulo, labelYear, informacion;
	private JTextField campoYear;
	private JButton botonComprobar;

	// Constructor
	public Formulario() {
		super.setTitle("Comprobar año biciesto");
		super.setBounds(100, 100, 600, 300);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.contenedor = super.getContentPane();
		this.contenedor.setLayout(null);

		// Titulo de formulario
		this.titulo = new JLabel("Comprobar año biciesto");
		this.titulo.setFont(new Font("Times new Roman", Font.PLAIN, 30));
		this.titulo.setSize(100, 20);// Para el titulo , es el tamaño
		this.titulo.setLocation(100, 100);
		this.contenedor.add(this.titulo);

		// Label campo del año
		this.labelYear = new JLabel();
		this.labelYear.setFont(new Font("Times new Roman", Font.PLAIN, 30));
		this.labelYear.setSize(100, 20);// Para el titulo , es el tamaño
		this.labelYear.setLocation(100, 100);
		this.contenedor.add(this.labelYear);

		// Label campo del año
		this.campoYear = new JTextField();
		this.campoYear.setFont(new Font("Times new Roman", Font.PLAIN, 30));
		this.campoYear.setSize(100, 20);// Para el titulo , es el tamaño
		this.campoYear.setLocation(100, 100);
		this.contenedor.add(this.campoYear);

		// Boton comprobar
		this.botonComprobar = new JButton("Comprobar");
		this.botonComprobar.setFont(new Font("Times new Roman", Font.PLAIN, 30));
		this.botonComprobar.setSize(100, 20);// Para el titulo , es el tamaño
		this.botonComprobar.setLocation(100, 155);
		this.botonComprobar.addActionListener(this);// Aqui se añade el listener

		this.contenedor.add(this.botonComprobar);

		// informacion
		this.informacion = new JLabel("");
		this.informacion.setFont(new Font("Times new Roman", Font.PLAIN, 30));
		this.informacion.setSize(500, 25);// Para el titulo , es el tamaño
		this.informacion.setLocation(100, 190);
		this.contenedor.add(this.informacion);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.botonComprobar) {
			this.comprobar();
		}

	}

	private void comprobar() {
		if (this.campoYear.getText().length() > 0) {
			int year = 0;
			try {
				year = Integer.parseInt(this.campoYear.getText());
			} catch (Exception e) {
				this.informacion.setText("El valor no es un año");
				return;
			}

			if (year < 0) {
				this.informacion.setForeground(Color.red);
				this.informacion.setText("El año no puede ser negativo");

				return;
			}
			if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
				this.informacion.setForeground(Color.black);
				this.informacion.setText("El año es biciesto");
			} else {
				this.informacion.setForeground(Color.black);
				this.informacion.setText("El año no es biciesto");
			}

		} else {
			this.informacion.setText("El campo año es obligatorio");
		}

	}

}
