package ATS_ejercicios;import javax.swing.JOptionPane;

public class Ejercicio26_ciclos {

	public static void main(String[] args) {
		// usar la condicion stwich
		final int saldo_inicial=1000;//usamos constante porque es un numero fijo
		int opcion;
		float ingreso,saldoActual,retiro;
		opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienbenido a su cajero autamatico\n"
				+"1. Ingresar el dinero a la cuenta\n"
				+"2. Retirar dinero de la cuenta\n"
				+"3. Salir"));
		switch(opcion) {
		case 1: ingreso=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad: "));
				saldoActual=saldo_inicial+ingreso;
				JOptionPane.showMessageDialog(null, "Digite en cuenta: "+saldoActual);
				break;
		case 2: retiro=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad: "));
				
				if(retiro>saldo_inicial) {
					JOptionPane.showMessageDialog(null,"No cuenta con esa cantidad");
				}else {
					saldoActual=saldo_inicial-retiro;
					JOptionPane.showMessageDialog(null, "Dinero en cuenta : "+saldoActual);
				}
				break;
		case 3:break;
		default:JOptionPane.showMessageDialog(null,"Se equivoco de opcion");
		}
	

	}

}
