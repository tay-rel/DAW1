package Classes;

public class ModificationUser extends Session {

	public static void modificationData() {
		Session ses = new Session();

		if (ses.islogged() == true) {
			String currentData[] = new String[6];
			currentData[0] = Interface.getString("Password: ");
			if (Utils.validatePassword(currentData[0]) == false) {
				System.err.println("Las contraseñas deben contener" + " por lo menos un número y un carácter especial, "
						+ "incluir letras en mayúscula y minúscula, " + "tener una longitud mínima de 8 caracteres y "
						+ "no contener su correo electrónico o coincidir con él.");
				return;
			}

			currentData[1] = Interface.getString("Nombre Completo: ");
			if (Utils.validateName(currentData[1]) == false) {
				System.err.println("El formato de la nombre no es correcto");
				return;
			}

			currentData[2] = Interface.getString("NIF: ");

			if (Utils.validateDni(currentData[2]) == false) {
				System.err.println("El formato del DNI no es correcto");
				return;
			}

			if (DATABASE.chekNif(currentData[2]) == true) {
				System.err.println("El NIF ya existe");
				return;
			}

			currentData[3] = Interface.getString("Email: ");

			if (Utils.validateEmail(currentData[3]) == false) {
				System.err.println("El formato del email no es correcto");
				return;
			}
			if (DATABASE.chekEmail(currentData[3]) == true) {
				System.err.println("El email ya existe");
				return;
			}

			currentData[4] = Interface.getString("Direccion: ");

			currentData[5] = Interface.getString("Fecha de nacimiento: ");
			if (Utils.validateDate(currentData[5]) == false) {
				System.err.println("El formato de la Fecha no es correcto");
				return;
			}
		}
	}

	public void deleteUser(String pass) {

	}

}
