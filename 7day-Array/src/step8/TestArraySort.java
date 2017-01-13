package step8;

public class TestArraySort {
	public static void main(String[] args) {
		int[] point = { 4, 2, 3, 1 };
		int tmp;
		printArray(point);
		// 배열 오름차순 정렬
		System.out.println("**오름차순 정렬**");
		for (int i = 1; i < point.length; i++) {
			for (int j = 0; j < point.length - i; j++) {
				if (point[j] > point[j + 1]) {
					tmp = point[j];
					point[j] = point[j + 1];
					point[j + 1] = tmp;
				}
			}
		}
		//Arrays.sort(point);
		printArray(point);
	}

	public static void printArray(int[] point) {
		for (int i = 0; i < point.length; i++)
			System.out.print(point[i] + " ");
		System.out.println();
	}
}
