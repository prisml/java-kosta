package step9;

public class TestFor7 {
	public static void main(String[] args) {
		exit:
		for(int i=0;i<10;i++){
			//labe�� ��� : �ݺ����� Ư����ġ�� ����� ���� ���
			for(int j=0;j<5;j++){
				if(i==5 && j==3){
					//break;// ����for���� �����
					//��ü for���� ���ƴϱ����� label�� �̿�
					break exit;
				}
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
