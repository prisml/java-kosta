package step5;

public class ScoreBoard {
	public void printGrade(int grade)
	{
		if(grade < 0 || grade > 100)
			System.out.println("�߸��� �Է°�");
		else if(grade >= 90)
			System.out.println("��");
		else if(grade >= 80)
			System.out.println("��");
		else if(grade >= 70)
			System.out.println("��");
		else if(grade >= 60)
			System.out.println("��");
		else
			System.out.println("��");
	}
}
