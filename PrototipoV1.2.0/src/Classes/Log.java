package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Log {

	public Log() {
		registerEvent();
	}

	public void registerEvent() {

		try {
			File myObj = new File(Config.logEvent + Config.saveEvent);
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public static void addLines(String event) {

		try {

			String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

			FileWriter myWriter = new FileWriter(Config.logEvent + Config.saveEvent, true);
			myWriter.write(timeStamp + "- " + event +"\n");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
	public static void addLines(String event, String dataEvent) {

		try {

			String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

			FileWriter myWriter = new FileWriter(Config.logEvent + Config.saveEvent, true);
			myWriter.write(timeStamp + "- " + event + "- '" + dataEvent+"'\n");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
