package step7;

class MyException extends Exception{
	private static final long serialVersionUID = 8074824799441588192L;
	public MyException(){}
	public MyException(String message){
		super(message);
	}
}
class AdultMovieService{
	public void watch(int age) throws MyException{
		if(age<19)
			throw new MyException("나이 더 먹고 오세요~~");
		System.out.println("즐감상~~");
	}
}
public class TestUserDefinedException {
	public static void main(String[] args) {
		AdultMovieService service = new AdultMovieService();
		try {
			service.watch(19);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
