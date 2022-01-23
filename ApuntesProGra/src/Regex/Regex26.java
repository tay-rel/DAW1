package Regex;
public class Regex26 {
	//para validar contraseña
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contrase�a="PrueBa89x$";//Comprueba si una contraseña es robusta asegurando una longitud mínima de 8 caracteres  
		String regex = "(?=.*[A-ZÑ])(?=.*[a-zñ])(?=.*\\d)(?=.+[$*-+&!?%]).{8,16}";
		//String contraseña="Pruebas7?";

		if(contrase�a.matches(regex)) {
            System.out.println("Formato de contraseña valido");
        } else {
            System.out.println("Formato de contraseña no valido");
        }
	}

}
