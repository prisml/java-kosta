package step1;

public class TestFinal {
	//final ����� ���Ҵ� �Ұ��ϰ� ������� �빮�ڷ� ǥ���ϰ�
	//�ռ���� _�� ǥ���Ѵ�
	private final String ADMIN_ID = "javaking";
	public final void updateId(){
		// ADMIN_ID = "starjava"; // final ����̹Ƿ� ���Ҵ� �Ұ�
	}
}

class SubTestFinal extends TestFinal{
	// final �޼���� �������̵� �� �� ����
	// public void updateId(){}
}
