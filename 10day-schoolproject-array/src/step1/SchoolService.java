package step1;

public class SchoolService {
	private int count = 0;
	private Person[] list = new Person[101];

	public void printAll() {
		for (int i = 0; i < count; i++) {
			System.out.println("    " + (i + 1) + "\t- " + list[i]);
		}
		if (count == 0)
			System.out.println("�Էµ� ������ �����ϴ�");
	}

	public void insertPerson(Person p) {
		int check = 0;
		if (count == 100) {
			check = 1;
			System.out.println("������ �ʰ��ƽ��ϴ�");
		}

		for (int i = 0; i < count; i++) {
			if (list[i].getPhoneNumber().equals(p.getPhoneNumber())) {
				check = 1;
				System.out.println("�ߺ��� ��ȣ�Դϴ�");
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
			System.out.println("��ϵ� ��ȣ�� �����ϴ�");
		return n;
	}

	public void updatePerson(Person p) {
		int i;
		for (i = 0; i < count; i++) {
			if (list[i].getPhoneNumber().equals(p.getPhoneNumber())) {
				list[i] = p;
				System.out.println("���� ������Ʈ �Ϸ�");
				break;
			}
		}
		if (i == count)
			System.out.println("��ϵ� ��ȣ�� �����Ƿ� ������Ʈ �Ұ�");
	}
	
	public void deletePerson(String pn) {
		int check = 0;
		for(int i=0;i<count;i++){
			if (check == 1 || list[i].getPhoneNumber().equals(pn)) {
				list[i] = list[i+1];
			}
		}
		count--;
		System.out.println("�����ƽ��ϴ�");
	}
}
