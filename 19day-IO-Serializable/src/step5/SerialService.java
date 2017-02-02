package step5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialService {
	String path;
	
	public SerialService(String path) {
		this.path = path;
	}
	
	public void writeMemberVO(MemberVo m) throws FileNotFoundException, IOException{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		oos.writeObject(m);
		oos.close();
	}

	public MemberVo readMemberVO() throws ClassNotFoundException, IOException {
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream(path));
		MemberVo m = (MemberVo) ios.readObject();
		ios.close();
		return m;
	}

}
