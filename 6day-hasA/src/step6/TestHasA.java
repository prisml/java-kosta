package step6;

public class TestHasA {
	public static void main(String[] args) {
		Student stu = new Student("아이유","15",new SmartPhone("갤럭시7",100));
		System.out.println(stu.getName()+" "+stu.getStuId());
		System.out.println(stu.getSmartPhone().getModel());
		System.out.println(stu.getSmartPhone().getPrice());
		stu.setSmartPhone("아이폰7");
		System.out.println(stu.getSmartPhone().getModel());
	}
}