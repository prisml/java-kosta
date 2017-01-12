package step2;

public class TestVariableScope {
	// instance variable : heap ���� ����, �⺻ �ʱ�ȭ 0
	private int i;
	public void test1(){
		int j; // local variable
		System.out.println(i); // �⺻�ʱ�ȭ�Ǿ� 0 ���
		//System.out.println(j); // j�� ���������̹Ƿ� �ʱ�ȭ �ʿ�
		int k=0; // ���������� ����� �ʱ�ȭ�ؾ� ��� ����
		System.out.println(k);
	}
	public void test2(int i){
		System.out.println(i);
		System.out.println(this.i);
		int j=2;
	}
	public void test3(){
		System.out.println(i);
		//System.out.println(j);
	}
	public void test4(){
		if(i<=0){
			int k=5;
		}
		//System.out.println(k); // error
		// ����� �ڽ��� ���࿵�� �������� ��� �����ϴ�.
	}
	public void test5(){
		int k=0;
		if(i<=0)
			k=5;
		System.out.println(k);
	}
	public static void main(String[] args) {
		// ���θ޼���� static �̹Ƿ� ���� Ŭ������ �޼����
		// ��ü�� �����ؼ� ȣ���ؾ� �Ѵ� ( static�� �����ֿ� ���� ����)
		TestVariableScope t = new TestVariableScope();
		t.test1();
	}
}
