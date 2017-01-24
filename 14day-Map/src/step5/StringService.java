package step5;

import java.util.ArrayList;

public class StringService {
	ArrayList<String> list = new ArrayList<String>();

	public void addFile(String string) {
		list.add(string);
	}

	public void printName(String ext) {
		for(int i=0;i<list.size();i++){
			if(list.get(i).substring(list.get(i).indexOf(".")+1).equals(ext))
				System.out.println(list.get(i).substring(0, list.get(i).indexOf(".")));
		}
	}

}
