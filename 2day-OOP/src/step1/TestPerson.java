package step1;
/*
 * TestPerson class�� Person class�� �̿���
 * ��ü �����ϰ� �Ӽ��� �����͸� �Ҵ��غ���
 * Person ��ü�� ����� �����غ��� ������ �Ѵ�
 * Person class : Person ��ü�� �����ϱ� ���� Ʋ
 * TestPerson class : main method�� �����Ͽ�
 * ���α׷��� ������ �����ϰ� �ϰ�
 * �ٸ� Ŭ������ �̿��� ��ü ���� �� ��� �׽�Ʈ�Ѵ�
 */

public class TestPerson {
	/*
	 * ���� �޼���� �ڹ� ���α׷��� ������
	 */
	public static void main(String[] args) {
		/* Person class�� �̿��� ��ü �����Ѵ�.
		 * Person : ������ Ÿ��(������ ������ Ÿ��)
		 * p : ������(��������)
		 * = : �Ҵ� or ����
		 * new : ��ü ������ �����ϴ� �ڹ� Ű����
		 */
		Person p = new Person();
		p.name = "������";//����(�Ӽ�)�� �̸��� �����Ѵ�.
		System.out.println("p.name");
		
		Person p2 = new Person();
		p2.name = "�����";
		
		p.study();
		p2.study();
	}
}