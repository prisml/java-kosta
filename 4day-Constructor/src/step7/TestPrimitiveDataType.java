package step7;

public class TestPrimitiveDataType {
	public static void main(String[] args) {
		// ������
		byte b1=11;
		//���� : byte���� �ִ밪 �ּҰ�
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		// byte b2=130; //�ִ밪�� �����Ƿ� error
		short s=130; // 2byte
		int i=130; // 4byte
		long lo=130; // 8byte �̹Ƿ� ����
		// �Ǽ���
		// float f=3.14; // �Ǽ����� �⺻���� double�̹Ƿ� error
		float f=3.14f; // float������ f�� ����� �˷��ش�
		double d=3.14; // �Ǽ����� �⺻�� 8byte
		// answkgud
		//char c='�椾'; char ���� �� ���ڸ� �����ϹǷ� error
		char c='��';
		//���� boolean ���� ���� true or false�� ����
		boolean flag=true;
		boolean bo=false;
		byte by1=1;
		byte by2=2;
		//byte by3=by1+by2; //--> ���� �Ŀ��� �������� �⺻�� int������ �ν�
		// �ذ����� ù��° by3�� Ÿ���� int�� �����ϸ� �ȴ�.
		int by3=by1+by2;
		// �ι�° ����� �������� byte������ ĳ�����ϸ� �ȴ�.
		byte by4=(byte)(by1+by2);
	}
}
