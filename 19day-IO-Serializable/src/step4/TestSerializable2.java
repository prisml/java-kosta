package step4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import step3.Person;

public class TestSerializable2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\java-kosta\\test\\serial\\person.obj");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();
			System.out.println(p);
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
