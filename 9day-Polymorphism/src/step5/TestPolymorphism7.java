package step5;

import step4.Animal;
import step4.Monkey;
import step4.Person;
import step4.Tiger;

class MyDate{}
public class TestPolymorphism7 {
	public static void main(String[] args) {
		//일반적으로 배열은 선언된 타입의 데이터만 요소로 추가 가능하다
		//즉 MyDate 타입의 배열은 MyDate 객체만 요소로 가능
		//MyDate[] date = {new MyDate(), new Monkey()};
		//단 부모 타입의 배열은 자식 객체를 요소로 추가가능
		Animal[] a = {new Monkey(), new Tiger(), new Person()};
		for(int i=0;i<a.length;i++){
			a[i].play();
		}
	}
}
