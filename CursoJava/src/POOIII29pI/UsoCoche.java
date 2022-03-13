package POOIII29pI;

import javax.swing.JOptionPane;

/*MODULARIZACION=aplicaciones complejas queden reducidas a un solo codigo
 * -ENCAPSULACION=nos sirve para que no se pueda modificar los datos de nuestra clase*/
public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche Renault=new Coche(); //la instruccion que da el operador new es invocar al constructor de la clase coche 
		System.out.println("El coche tiene "+Renault.getRuedas()+" ruedas.");
		System.out.println(Renault.dime_datosGenerales());//accedemos a la propiedad de los objetos
		
		Renault.establece_Color(JOptionPane.showInputDialog("Introduce color"));//debemos instanciar el objeto para ver el color modificado con el metodo setter
		System.out.println(Renault.dime_Color());
		
		Renault.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(Renault.dimeAsientos());
		
		Renault.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(Renault.dimeClimatizador());
		
		System.out.println(Renault.dimePeso_coche());
		
		System.out.println("El precio es "+Renault.dimePrecio_coche()+" €");
	}

}
