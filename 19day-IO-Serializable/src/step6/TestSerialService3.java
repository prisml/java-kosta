package step6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class TestSerialService3 {
	public static void main(String[] args) {
		String path = "C:\\java-kosta\\test\\serial\\FoodList.obj";
		SerialListService service = new SerialListService(path);
		ArrayList<FoodVO> list = new ArrayList<FoodVO>();
		list.add(new FoodVO("족발",20000));
		list.add(new FoodVO("커피",3000));
		list.add(new FoodVO("맥주",5000));
		try {
			service.outputList(list);
			System.out.println("저장완료");
			ArrayList<FoodVO> result = service.readList();
			System.out.println(result.size());
			for(int i=0;i<result.size();i++)
				System.out.println(result.get(i));
		} catch (FileNotFoundException e) {
			System.out.println(1);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(2);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
