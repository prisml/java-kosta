package step1;

public class TestWrapper {
	public static void main(String[] args) {
		int i = 1;
		Object obj = i; // auto boxing
		System.out.println(obj.getClass());
		// auto unboxing(자동으로 Wrapper class 참조형에서 기본형으로 변환
		int j = (Integer)obj; 
		System.out.println(j);
	}
}
