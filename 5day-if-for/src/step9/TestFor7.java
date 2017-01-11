package step9;

public class TestFor7 {
	public static void main(String[] args) {
		exit:
		for(int i=0;i<10;i++){
			//labe을 명시 : 반복문을 특정위치로 벗어나기 위해 사용
			for(int j=0;j<5;j++){
				if(i==5 && j==3){
					//break;// 내부for문만 벗어난다
					//전체 for문을 벗아니기위해 label을 이용
					break exit;
				}
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
}
