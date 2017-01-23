package step1;

import java.util.ArrayList;

public class SchoolService {
	private ArrayList<Person> list = new ArrayList<Person>();

	public void printAll() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("    " + (i + 1) + "\t- " + list.get(i));
		}
		if (list.size() == 0)
			System.out.println("입력된 정보가 없습니다");
	}

	public void insertPerson(Person p) {
		int check = 0;
		if (list.size() == 100) {
			check = 1;
			System.out.println("정원이 초과됐습니다");
		}

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNumber().equals(p.getPhoneNumber())) {
				check = 1;
				System.out.println("중복된 번호입니다");
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
			System.out.println("등록된 번호가 없습니다");
		return n;
	}

	public void updatePerson(Person p) {
		int i;
		for (i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNumber().equals(p.getPhoneNumber())) {
				list.remove(i);
				list.add(p);
				System.out.println("정보 업데이트 완료");
				break;
			}
		}
		if (i == list.size())
			System.out.println("등록된 번호가 없으므로 업데이트 불가");
	}

	public void deletePerson(String pn) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNumber().equals(pn)) {
				list.remove(i);
				break;
			}
		}
		System.out.println("삭제됐습니다");
	}
}
