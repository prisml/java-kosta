package step9;

public class LoopService {
	public void printInfo(String name, int n)
	{
		for(int i=1;i<=n;i++)
			System.out.println(name + " " + i + "ÀÜ");
	}

	public void printInfoLimit(String item, int count, int limit) {
		if(limit == 0)
			limit = count;
		for(int i=1;i<=limit;i++)
			System.out.println(item + " " + i + "ÀÜ");
	}
}
