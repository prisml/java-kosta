package step2;

import java.util.HashMap;

public class TestMap1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("1",new Person("아이유",24));
		map.put("2",new Person("장기하",30));
		// Generic을 적용하지 않았으므로 최상위 클래스 타입인 Object형으로
		// 반환된다. getName() 을 호출하기 위해서는 Object Casting이 필요하다
		Person p = (Person)map.get("2");
		System.out.println(p.getName());
		
		HashMap<String,Person> genericMap = new HashMap<String, Person>();
		genericMap.put("a", new Person("기성용",30));
		System.out.println(genericMap.get("a").getName());
		genericMap.put("a", new Person("손흥민",26));
		System.out.println(genericMap.get("a").getName());
		System.out.println(genericMap);
		genericMap.put("b", new Person("메시",30));
		boolean flag = genericMap.containsKey("bb");
		System.out.println("key 존재유무 : " + flag);
		System.out.println(genericMap.remove("a"));
		System.out.println(genericMap);
	}
}
