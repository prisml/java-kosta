package algo;

import java.util.Scanner;

public class Problem1963 {
	static int[] list;
	static int thou = -1;
	static int cnt = 0;

	static void makePrime() {
		list = new int[10000];
		for (int i = 2; i < 10000; i++) {
			int j;
			for (j = 0; j * j < cnt; j++)
				if (i % list[j] == 0)
					break;
			if (j == cnt)
				list[cnt++] = i;
			if (thou == -1 && i > 1000)
				thou = cnt;
		}
	}

	static boolean compare(int x, int y) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (x % 10 != y % 10)
				count++;
			x /= 10;
			y /= 10;
		}
		if (count == 1)
			return true;
		return false;
	}

	static int find(int x, int y) {
		int qu[] = new int[1000];
		int coqu[] = new int[1000];
		int fr = -1, re = 0;
		int tmp = 0;
		int cotmp = 0;
		int result = -1;
		boolean[] ckList = new boolean[10000];
		System.out.println(thou);
		for (int i = thou; i < cnt; i++) {
			ckList[i] = false;
			if (list[i] == x) {
				ckList[i] = true;
			}
		}
		qu[++fr] = x;
		qu[fr] = 0;
		while (fr != re) {
			tmp = qu[re];
			cotmp = coqu[re++];
			if (tmp == y) {
				result = cotmp;
				break;
			}
			for (int i = thou; i < cnt; i++) {
				if (compare(tmp, list[i]) && !ckList[i]) {
					qu[++fr] = list[i];
					coqu[fr] = cotmp + 1;
					ckList[i] = true;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n;
		int result;
		Scanner scan = new Scanner(System.in);
		Problem1963.makePrime();
		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			int x, y;
			x = scan.nextInt();
			y = scan.nextInt();
			result = Problem1963.find(x, y);
			if (result != -1)
				System.out.println(result);
			else
				System.out.println("Impossible");
		}
		scan.close();
	}
}