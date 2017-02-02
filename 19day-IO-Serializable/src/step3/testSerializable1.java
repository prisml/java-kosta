package step3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * java.io.NotSerializableException : step3.Person
 * ���Ͱ��� Exception�� ����ȭ�Ǿ� ��µ� Person class�� 
 * java.io.Serializable �������̽��� implements ���� �ʾ�
 * ����ȭ�Ǿ�3 �ܺη� ���۵� �� ������ �˸��� ����
 * �� ����ȭ�Ǿ� �ܺη� ���۵Ǳ� ���ؼ��� �ݵ��
 * java.io.serializble interface�� implements �ؾ� �Ѵ�
 */

public class testSerializable1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("C:\\java-kosta\\test\\serial\\person.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Person p = new Person("������","�Ǳ�");
			oos.writeObject(p);
			System.out.println("��ü");
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
