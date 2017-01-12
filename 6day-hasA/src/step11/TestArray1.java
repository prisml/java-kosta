package step11;

public class TestArray1 {
	public static void main(String[] args) {
		int[] ages;
		ages = new int[3]; // length 3 硅凯 按眉 积己
		System.out.println(ages.length);
		ages[0] = 10;
		ages[1] = 30;
		ages[2] = 20;
		// System.out.println(ages[3]); // exception 惯积
		for (int i = 0; i < ages.length; i++)
			System.out.println(ages[i]);
	}
}
