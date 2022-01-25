package Regex;
public class Regex26 {
	//para validar contraseÃ±a
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String contraseña="PrueBa89x$";//Comprueba si una contraseÃ±a es robusta asegurando una longitud mÃ­nima de 8 caracteres  
		String regex = "(?=.*[A-ZÑ])(?=.*[a-zñ])(?=.*\\\\d)(?=.+[$*-+&!?%]).{8,16}";
		//String contraseña="Pruebas7?";

		if(contraseña.matches(regex)) {
            System.out.println("Formato de contraseña valido");
        } else {
            System.out.println("Formato de contraseña no valido");
        }
	}

}
