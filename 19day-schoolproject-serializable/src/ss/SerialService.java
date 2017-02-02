package ss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import school.SchoolService;

public class SerialService {
	private String path;
	public SerialService(String path) {
		this.path=path;
	}
	public void writeSerial(SchoolService ui) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		oos.writeObject(ui);
		oos.close();
	}
	public SchoolService readSerial() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		SchoolService ui = (SchoolService) ois.readObject();
		ois.close();
		return ui;
	}
}
