package step1;

import java.util.Scanner;

public class TestExceptionReview {
	/* 
	 * ���¼��� �Աݽ�
	 * �ݾ��� 0�� �����̸� InvalidMoneyException�� �߻���Ű��
	 * ȣ���� ������ �ش� Exception�� �����ϴ� ����
	 */
	public static void main(String[] args) {
		AccountService service = new AccountService();
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���");
		Scanner s = new Scanner(System.in);
		try{
			int money = Integer.parseInt(s.nextLine());
			service.deposit(money);
			System.out.println("�ԱݿϷ� �� �۾�");
		}catch(InvalidMoneyException e){
			System.out.println(e.getMessage());
		}catch(NumberFormatException e){
			System.out.println("�ݾ��� ���ڷ� �Է��ϼ���");
		}finally{
			s.close();
		}
	}
}
