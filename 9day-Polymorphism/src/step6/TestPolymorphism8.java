package step6;

import step4.Animal;
import step4.Monkey;
import step4.Person;
import step4.Tiger;

public class TestPolymorphism8 {
	public static void main(String[] args) {
		ZooMgr mgr = new ZooMgr();
		Animal ani[]={new Tiger(),new Monkey(),new Person()};
		mgr.enter(ani);
	}
}
