package PrimerosPasos;import javax.swing.JOptionPane;

public class Email_Buclefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
		for(int i=0; i<mail.length(); i++) {
			
			if(mail.charAt(i)=='@') {
				arroba=true;
			}
		}

		if(arroba==true) {
			System.out.println("Es correcto");
			
		}else {
			System.out.println("No es correcto");
		}
	}

}
