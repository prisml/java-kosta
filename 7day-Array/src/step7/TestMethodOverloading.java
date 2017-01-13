package step7;

class Person{
	public void eat(){
		System.out.println("¸Ô´Ù");
	}
	// ¸Þ¼­µå ¿À¹ö·Îµù
	public void eat(String menu){
		System.out.println(menu + " ¸Ô´Ù");
	}
	public void eat(int count){
		System.out.println(count + "ÀÎºÐ ¸Ô´Ù");
	}
	public void eat(String menu, int count){
		System.out.println(menu + " " + count + "ÀÎºÐ ¸Ô´Ù");
	}
}

public class TestMethodOverloading {
	public static void main(String[] args) {
		Person p = new Person();
		p.eat();
		p.eat("´ëÀåºÎ");
		p.eat(3);
		p.eat("»ï°ã»ì",8);
	}
}
