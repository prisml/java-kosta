package step8;

public class MemberService {

	public void register(String nickName) throws NickNameException{
		if(nickName.length()>=2 && nickName.length()<=5)
			System.out.println(nickName);
		else
			throw new NickNameException("헐 닉네임은 등록될 수 없습니다(2자 이상 5자 이하만 가능)");
	}
}
