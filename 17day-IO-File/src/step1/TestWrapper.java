package step1;

public class TestWrapper {
	public static void main(String[] args) {
		int i = 1;
		Object obj = i; // auto boxing
		System.out.println(obj.getClass());
		// auto unboxing(�ڵ����� Wrapper class ���������� �⺻������ ��ȯ
		int j = (Integer)obj; 
		System.out.println(j);
	}
}
