package step8;

public class TestReferenceDataType {
	public static void main(String[] args) {
		/*
		 * SmartPhone : reference data type ������
		 * sp1 : reference variable ��������
		 * = : assign �Ҵ�, ����
		 * new : java keyword
		 * SmartPhone() : ������ constructor
		 */
		/*SmartPhone sp1 = new SmartPhone();
		System.out.println(sp1); // ��ü �ּҰ� ���
		SmartPhone sp2 = new SmartPhone();
		System.out.println(sp2); // ��ü �ּҰ� ���
		*/		
		SmartPhone sp1 = new SmartPhone("������7");
		SmartPhone sp2 = new SmartPhone("������7");
		//sp1 �ּҰ��� sp2�� �Ҵ�
		sp2 = sp1;
		sp1.setModel("LG");
		System.out.println(sp1.getModel());
		System.out.println(sp2.getModel());
	}
}
