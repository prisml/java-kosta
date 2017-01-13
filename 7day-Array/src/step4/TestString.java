package step4;

public class TestString {
	public static void main(String[] args) {
		String name1="아이유,설현,장기하";
		String na[] = name1.split(",");
		for(int i=0;i<na.length;i++)
			System.out.println(na[i]);
		System.out.println("***************");
		String str1="설현";
		String str2=new String("설현");
		System.out.println(str1);
		System.out.println(str2);
		StringBuilder sb = new StringBuilder("설현");
		System.out.println(sb);
		System.out.println(str1==str2);//같은 설현이지만 비교가 안됨
		System.out.println(str1==sb.toString());
		String str3="설현";
		System.out.println(str1.equals(str3));
	}
}