package step4;

public class TestObjectInit2 {
	public static void main(String[] args) {
		MyDate m = new MyDate(1,12);
		System.out.println(m.getMonth() + "��" + m.getDay() + "��");
		MyDate m2 = new MyDate(1,32);
		System.out.println(m2.getMonth() + "��" + m2.getDay() + "��");
		MyDate m3 = new MyDate(13,12);
		System.out.println(m3.getMonth() + "��" + m3.getDay() + "��");
	}
}
