package step1;

public class SchoolService {
	private int count = 0;
	private Person[] list = new Person[101];

	public void printAll() {
		for (int i = 0; i < count; i++) {
			System.out.println("    " + (i + 1) + "\t- " + list[i]);
		}
		if (count == 0)
			System.out.println("입력된 정보가 없습니다");
	}

	public void insertPerson(Person p) {
		int check = 0;
		if (count == 100) {
			check = 1;
			System.out.println("정원이 초과됐습니다");
		}

		for (int i = 0; i < count; i++) {
			if (list[i].getPhoneNumber().equals(p.getPhoneNumber())) {
				check = 1;
				System.out.println("중복된 번호입니다");
				break;
			}
		}
		if (check == 0) {
			list[count] = p;
			count++;
		}
	}

	public Person searchPerson(String pn) {
		Person n = new Person();
		int i;
		for (i = 0; i < count; i++) {
			if (list[i].getPhoneNumber().equals(pn)) {
				System.out.println(list[i]);
				n = list[i];
				break;
			}
		}
		if (i == count)
			System.out.println("등록된 번호가 없습니다");
		return n;
	}

	public void updatePerson(Person p) {
		int i;
		for (i = 0; i < count; i++) {
			if (list[i].getPhoneNumber().equals(p.getPhoneNumber())) {
				list[i] = p;
				System.out.println("정보 업데이트 완료");
				break;
			}
		}
		if (i == count)
			System.out.println("등록된 번호가 없으므로 업데이트 불가");
	}
	
	public void deletePerson(String pn) {
		int check = 0;
		for(int i=0;i<count;i++){
			if (check == 1 || list[i].getPhoneNumber().equals(pn)) {
				list[i] = list[i+1];
			}
		}
		count--;
		System.out.println("삭제됐습니다");
	}
}
