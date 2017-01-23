package step1;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Person> list = new ArrayList<Person>();

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("    " + (i + 1) + "\t- " + list.get(i));
		}
		if (list.size() == 0)
			System.out.println("�Էµ� ������ �����ϴ�");
	}

	public void insertPerson(Person p) {
		int check = 0;
		if (list.size() == 100) {
			check = 1;
			System.out.println("������ �ʰ��ƽ��ϴ�");
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNumber().equals(p.getPhoneNumber())) {
				check = 1;
				System.out.println("�ߺ��� ��ȣ�Դϴ�");
				break;
			}
		}
		if (check == 0) {
			list.add(p);
		}
	}

	public Person searchPerson(String pn) {
		Person n = new Person();
		int i;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNumber().equals(pn)) {
				System.out.println(list.get(i));
				n = list.get(i);
				break;
			}
		}
		if (i == list.size())
			System.out.println("��ϵ� ��ȣ�� �����ϴ�");
		return n;
	}

	public void updatePerson(Person p) {
		int i;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNumber().equals(p.getPhoneNumber())) {
				list.remove(i);
				list.add(p);
				System.out.println("���� ������Ʈ �Ϸ�");
				break;
			}
		}
		if (i == list.size())
			System.out.println("��ϵ� ��ȣ�� �����Ƿ� ������Ʈ �Ұ�");
	}

	public void deletePerson(String pn) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNumber().equals(pn)) {
				list.remove(i);
				break;
			}
		}
		System.out.println("�����ƽ��ϴ�");
	}
}
