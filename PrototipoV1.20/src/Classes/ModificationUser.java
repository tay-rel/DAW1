package Classes;

public class ModificationUser {

	public static void option(User user) {

		int option = Interface.getInt(Config.modMenuData);
		switch (option) {
		case 1:
			DATABASE.updateData(user, "password", chooseData("password"));
			break;
		case 2:
			DATABASE.updateData(user, "name", chooseData("name"));
			break;
		case 3:
			DATABASE.updateData(user, "nif", chooseData("nif"));
			break;
		case 4:
			DATABASE.updateData(user, "email", chooseData("email"));
			break;
		case 5:
			DATABASE.updateData(user, "address", chooseData("address"));
			break;
		case 6:
			DATABASE.updateData(user, "birthdate", chooseData("birthdate"));
			break;

		default:
			break;
		}

	}

	public static String chooseData(String data) {
		if (data.equals("password")) {

			String pass = Interface.getString("Password: ");
			if (Utils.validatePassword(pass) == false) {
				System.err.println("Las contrase�as deben contener" + " por lo menos un n�mero y un car�cter especial, "
						+ "incluir letras en may�scula y min�scula, " + "tener una longitud m�nima de 8 caracteres y "
						+ "no contener su correo electr�nico o coincidir con �l.");
				Log.addLines("La modificacion no se ha realizado correctamente", pass);

			} else {
				return pass = Utils.getMD5(pass);

			}
		}
		if (data.equals("name")) {
			data = Interface.getString("Nombre Completo: ");
			if (Utils.validateName(data) == false) {
				System.err.println("El formato del nombre no es correcto");
				Log.addLines("La modificacion no se ha realizado correctamente", data);
			} else {
				return data;
			}
		}
		if (data.equals("nif")) {
			data = Interface.getString("NIF: ");

			if (Utils.validateDni(data) == false) {
				System.err.println("El formato del DNI no es correcto");
				Log.addLines("La modificacion no se ha realizado correctamente", data);

			} else {
				return data;
			}
			if (DATABASE.chekData("nif", data) == true) {
				System.err.println("El NIF ya existe");
				Log.addLines("El registro no se ha realizado correctamente", data);

			} else {
				return data;
			}
		}

		if (data.equals("email")) {
			data = Interface.getString("Email: ");
			if (Utils.validateEmail(data) == false) {
				System.err.println("El formato del email no es correcto");
				Log.addLines("La modificacion no se ha realizado correctamente", data);

			} else {
				return data;
			}
			if (DATABASE.chekData("email", data) == true) {
				System.err.println("El email ya existe");
				Log.addLines("La modificacion no se ha realizado correctamente", data);

			} else {
				return data;
			}
		}
		if (data.equals("address")) {
			data = Interface.getString("Direccion: ");
		}
		if (data.equals("birthdate")) {
			data = Interface.getString("Fecha de nacimiento: ");
			if (Utils.validateDate(data) == false) {
				System.err.println("El formato de la Fecha no es correcto");
				Log.addLines("El registro no se ha realizado correctamente", data);

			} else {
				return data;
			}
		}
		return "null";

	}

}