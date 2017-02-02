package step3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * java.io.NotSerializableException : step3.Person
 * 위와같은 Exception은 직렬화되어 출력될 Person class가 
 * java.io.Serializable 인터페이스를 implements 하지 않아
 * 직렬화되어3 외부로 전송될 수 없음을 알리는 예외
 * 즉 직렬화되어 외부로 전송되기 위해서는 반드시
 * java.io.serializble interface를 implements 해야 한다
 */

public class testSerializable1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\java-kosta\\test\\serial\\person.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Person p = new Person("아이유","판교");
			oos.writeObject(p);
			System.out.println("객체");
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
