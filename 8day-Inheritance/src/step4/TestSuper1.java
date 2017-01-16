package step4;
class A{
	A(){
		System.out.println("A 按眉 积己");
	}
}
class B extends A{
	B(){
		System.out.println("B 按眉 积己");
	}
}
class C extends B{
	C(){
		System.out.println("C 按眉 积己");
	}
}
public class TestSuper1 {
	public static void main(String[] args) {
		C a = new C();
		// A -> B -> C 鉴栏肺 按眉 积己
	}
}
