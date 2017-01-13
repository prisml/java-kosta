package step6;

public class Test2DArray {
	public static void main(String[] args) {
		// 2년 동안 매달 강수량을 저장 2*12
		int [][] rain;
		rain = new int [2][12];
		rain[0][0]=100;
		rain[1][11]=200;
		System.out.println(rain.length);
		System.out.println(rain[0].length);
		System.out.println("***********");
		// 판교중학교 1학년 3반, 2학년 2반, 3학년 4반
		int [][] stu = new int[3][];
		stu[0] = new int[3];
		stu[1] = new int[2];
		stu[2] = new int[4];
	}
}
