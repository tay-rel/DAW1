package Swing10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

public class Formulario10 extends JFrame implements ActionListener {
	private Container contenedor;
	private JLabel titulo, labelNombre, labelSelectorCampo, informacion;
	private JTextField campoNombre;
	private JComboBox selectorCampo;
	private JTable resultados;
	private JButton botonBuscar, botonReset;
	private JRadioButton asc,desc;		//botones 
	private String[] columnas = { "Nombre", "Apellido 1", "Apellido 2", "Departamento" };
	private JScrollPane panelScroll;

	public Formulario10() {
		super.setTitle("Instituto");
		super.setBounds(100, 100, 800, 600);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.contenedor = super.getContentPane();
		this.contenedor.setLayout(null);

		// Titulo del formulario

		this.titulo = new JLabel("Ver profesores");
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
	
		this.selectorCampo.addItem("profesor.nombre");
		this.selectorCampo.addItem("profesor.apellido1");
		this.selectorCampo.addItem("profesor.apellido2");
		this.selectorCampo.addItem("departamento.nombre");
		this.contenedor.add(this.selectorCampo);
		
		//RadioButons
		this.asc=new JRadioButton("Ascendente");
		this.asc.setFont(new Font("Arial", Font.PLAIN, 15));
		this.asc.setSize(110, 20);
		this.asc.setLocation(300, 150);
		this.asc.setSelected(true);   //para que el iniciao ya este marcado
		
		this.desc=new JRadioButton("Descendente");
		this.desc.setFont(new Font("Arial", Font.PLAIN, 15));
		this.desc.setSize(110, 20);
		this.desc.setLocation(410, 150);
		this.desc.setSelected(true);   //para que el iniciao ya este marcado
		
		ButtonGroup grupo = new ButtonGroup();		//añadimos al mismo grupo cuando uno este a true el otro esta a false
		grupo.add(this.asc);
		grupo.add(this.desc);
		this.contenedor.add(this.asc);
		this.contenedor.add(this.desc);
		
		
		
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
		this.panelScroll= new JScrollPane(this.resultados);
		this.panelScroll.setBounds(25,240,750,300);
		this.panelScroll.setVisible(true);
		this.contenedor.add(this.panelScroll);		//dentro del panel scroll entra los resultados
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
		String orden=this.asc.isSelected()? "ASC": "DESC";								//booleano que devolvera el valor
		
		ArrayList<Profesor> lista=DBSwing10.consulta(texto, campo,orden);
		if(lista.size()>0) {
			this.informacion.setText("Se ha encontrado "+lista.size()+" resultados!");
			this.setResultados(lista);
		}else {
			this.informacion.setText("NO SE HA ENCONTRADO RESULTADOS....");
			this.resultados.setModel(new DefaultTableModel(new String[0][0], this.columnas));
		}

	}
	
	private void setResultados(ArrayList<Profesor> lista) {
		String[][] datos = new String[lista.size()][4];
		for (int i = 0; i < lista.size(); i++) {
			datos[i][0]=lista.get(i).getNombre();
			datos[i][1]=lista.get(i).getApellido1();
			datos[i][2]=lista.get(i).getApellido2();
			datos[i][3]=lista.get(i).getDepartamento();
		}
		this.resultados.setModel(new DefaultTableModel(datos,this.columnas));
		
	}

}
