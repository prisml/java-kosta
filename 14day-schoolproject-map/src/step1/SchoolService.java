package step1;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class SchoolService {
	LinkedHashMap<String, Person> map = new LinkedHashMap<String, Person>();

	public void insertPerson(Person p) {
		if (map.get(p.getPhoneNumber()) != null)
			System.out.println("�ߺ�");
		else
			map.put(p.getPhoneNumber(), p);
	}

	public void printAll() {
		Iterator<Person> it = map.values().iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

	public void searchPerson(String string) {
		if (map.get(string) != null)
			System.out.println(map.get(string));
		else
			System.out.println("��� ����");
	}

	public void updatePerson(Person p) {
		if (map.get(p.getPhoneNumber()) != null)
			map.put(p.getPhoneNumber(), p);
		else
			System.out.println("��� ����");
	}

	public void deletePerson(String string) {
		if (map.get(string) != null)
			map.remove(string);
		else
			System.out.println("��� ����");
	}
}