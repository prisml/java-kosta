package step5;

public class ScoreBoard {
	public void printGrade(int grade)
	{
		if(grade < 0 || grade > 100)
			System.out.println("잘못된 입력값");
		else if(grade >= 90)
			System.out.println("수");
		else if(grade >= 80)
			System.out.println("우");
		else if(grade >= 70)
			System.out.println("미");
		else if(grade >= 60)
			System.out.println("양");
		else
			System.out.println("가");
	}
}
