package step8;

public class MonthService {
	public void printLastDay(int month)
	{
		switch(month){
		case 2:
			System.out.println(month+"���� ������ ���� 28�� �Դϴ�"); break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"���� ������ ���� 31�� �Դϴ�"); break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"���� ������ ���� 30�� �Դϴ�"); break;
		default: 
			System.out.println("�߸��� �Է°��Դϴ�"); break;
		}
	}
}
