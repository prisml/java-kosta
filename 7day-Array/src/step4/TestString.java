package step4;

public class TestString {
	public static void main(String[] args) {
		String name1="������,����,�����";
		String na[] = name1.split(",");
		for(int i=0;i<na.length;i++)
			System.out.println(na[i]);
		System.out.println("***************");
		String str1="����";
		String str2=new String("����");
		System.out.println(str1);
		System.out.println(str2);
		StringBuilder sb = new StringBuilder("����");
		System.out.println(sb);
		System.out.println(str1==str2);//���� ���������� �񱳰� �ȵ�
		System.out.println(str1==sb.toString());
		String str3="����";
		System.out.println(str1.equals(str3));
	}
}