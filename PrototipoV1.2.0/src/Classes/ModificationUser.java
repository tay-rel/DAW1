package Classes;

import com.mysql.cj.util.Util;

public class ModificationUser {

	public static void option(User user) {

		int option = Interface.getInt(Config.modMenuData);
		switch (option) {
		case 1:
			DATABASE.updateData(user, chooseData("password"));
			break;
		case 2:
			DATABASE.updateData(user, chooseData("name"));
			break;
		case 3:
			DATABASE.updateData(user, chooseData("nif"));
			break;
		case 4:
			DATABASE.updateData(user, chooseData("email"));
			break;
		case 5:
			DATABASE.updateData(user, chooseData("address"));
			break;
		case 6:
			DATABASE.updateData(user, chooseData("birthdate"));
			break;

		default:
			break;
		}

	}

	public static String chooseData(String data) {
		if (data == "password") {

			String pass = Interface.getString("Password: ");
			if (Utils.validatePassword(pass) == false) {
				System.err.println("Las contraseñas deben contener" + " por lo menos un número y un carácter especial, "
						+ "incluir letras en mayúscula y minúscula, " + "tener una longitud mínima de 8 caracteres y "
						+ "no contener su correo electrónico o coincidir con él.");
				Log.addLines("La modificacion no se ha realizado correctamente", pass);

				return pass;
			} else {
				pass = Utils.getMD5(pass);
			}
		}
		if (data == "name") {
			data = Interface.getString("Nombre Completo: ");
			if (Utils.validateName(data) == false) {
				System.err.println("El formato del nombre no es correcto");
				Log.addLines("La modificacion no se ha realizado correctamente", data);

				return data;
			}
		}
		if (data == "nif") {
			data = Interface.getString("NIF: ");

			if (Utils.validateDni(data) == false) {
				System.err.println("El formato del DNI no es correcto");
				Log.addLines("La modificacion no se ha realizado correctamente", data);

				return data;
			}
			if (DATABASE.chekNif(data) == true) {
				System.err.println("El NIF ya existe");
				Log.addLines("La modificacion no se ha realizado correctamente", data);

				return data;
			}
		}

		if (data == "email") {
			data = Interface.getString("Email: ");
			if (Utils.validateEmail(data) == false) {
				System.err.println("El formato del email no es correcto");
				Log.addLines("El registro no se ha realizado correctamente", data);

				return data;
			}
			if (DATABASE.chekEmail(data) == true) {
				System.err.println("El email ya existe");
				Log.addLines("El registro no se ha realizado correctamente", data);

				return data;
			}
		}
		if (data == "address") {
			data = Interface.getString("Direccion: ");
		}
		if (data == "birthdate") {
			data = Interface.getString("Fecha de nacimiento: ");
			if (Utils.validateDate(data) == false) {
				System.err.println("El formato de la Fecha no es correcto");
				Log.addLines("El registro no se ha realizado correctamente", data);

				return data;
			}
		}

		return "jgfkjngkjf";
	}

}
