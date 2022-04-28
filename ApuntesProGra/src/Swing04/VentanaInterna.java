package Swing04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaInterna extends JFrame implements ActionListener {
	private JDesktopPane escritorio;
	private int numVentanas = 0;
	private int margenX = 20;
	private int margenY = 20;
	JMenuItem nuevoElemento,cerrarPrograma;

	public VentanaInterna(String titulo) {
		super(titulo);
		Dimension tamPantalla = Toolkit.getDefaultToolkit().getScreenSize();
		super.setBounds(100, 100, tamPantalla.width - 1000, tamPantalla.height - 500);
		this.escritorio = new JDesktopPane();
		super.setContentPane(escritorio);
		this.crearFrame();
		// BARRAMENU
		JMenuBar barraMenu = new JMenuBar();
		JMenu menu = new JMenu("Archivo");
		nuevoElemento = new JMenuItem("Nuevo elemento");

		cerrarPrograma = new JMenuItem("Cerrar programa");// Se crea nuevo elemento

		// AÑADIR iTEM AL MENU
		menu.add(nuevoElemento);
		menu.add(cerrarPrograma);
		barraMenu.add(menu);

		// AÑADIR EL ITEM AL MENU Y EL MENU A LA BARRA
		super.setJMenuBar(barraMenu);
		nuevoElemento.addActionListener(this);
		cerrarPrograma.addActionListener(this);
	}

	private void crearFrame() {
		JInternalFrame frame = new JInternalFrame("Archivo #" + (++this.numVentanas), false// redimensionable(si/no)
				, true// Cerrable (si/no)
				, false// Maximizable(si/no)
				, true);// Con icono (si/no)
		// tamalño del frame
		frame.setSize(200, 200);
		// Posicion inicial
		frame.setLocation(this.margenX * this.numVentanas, this.margenY * this.numVentanas);
		try {
			frame.setSelected(true);
		} catch (java.beans.PropertyVetoException e) {
			System.out.println("Error");
		}
		// Añadir frame escritorio
		this.escritorio.add(frame);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()== this.nuevoElemento) {
			this.crearFrame();
		} else if (e.getSource()==this.cerrarPrograma) {
			  JFrame jFrame = new JFrame();
		        int result = JOptionPane.showConfirmDialog(jFrame, "Estas seguro?de tu seguridad?",
		        		"Salir",0);
		        //0=si,1=no, 2=cancelar
			if(result ==0) {
				System.exit(0);
			}
		}

	}

}