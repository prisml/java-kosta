package algo;

import java.util.Scanner;

public class Yoon {
	public void go() {
		Scanner scan = new Scanner(System.in);
		int n;
		long result;
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int x, y;
			x = scan.nextInt();
			y = scan.nextInt();
			result = (long) (Math.pow(((x / y) + 1), (x % y)) * Math.pow(x/y, (y - (x % y))));
			System.out.println(result);
		}
		scan.close();
	}

	public static void main(String[] args) {
		new Yoon().go();
	}
}
