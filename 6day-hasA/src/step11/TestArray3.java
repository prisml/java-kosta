package step11;

public class TestArray3 {
	public static void main(String[] args) {
		// �迭 ���� ���� �Ҵ� ���ÿ�
		int sum=0;
		int[] point={200,300,100,400,600};
		
		for(int i=0;i<point.length;i++)
			sum+=point[i];
		System.out.println("��� ����Ʈ: " + sum/5);
	}
}
