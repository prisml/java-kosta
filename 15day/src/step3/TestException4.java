package step3;

public class TestException4 {
	public static void main(String[] args) {
		String names[] = { "����", "������", "�����" };
		try {
			//System.out.println(names[2]);//13
			System.out.println(names[3]);//23
			System.out.println("1.�Ұ���");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("2.catch������ ����� �����Ѵ�");
		}
		System.out.println("3.���α׷� ���� ���� �� ����");
	}
}
