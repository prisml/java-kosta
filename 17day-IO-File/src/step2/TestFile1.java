package step2;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) {
		File dir = new File("C:" + File.separator + "java-kosta");
		System.out.println(dir.exists());
		System.out.println(dir.isDirectory());
		System.out.println(dir.isFile());
		System.out.println(dir.getPath());
		//java-kosta 아래에 test이름의 디렉토리를 생성해보자
		File testDir = new File(dir.getPath()+File.separator+"test");
		System.out.println(testDir.mkdirs());
		//test 디렉토리에 a.txt파일을 생성해보자
		File file = new File(testDir.getPath()+File.separator+"a.txt");
		System.out.println(file.getPath());
		System.out.println(file.exists());
		// createNewFile() 메서드로 파일을 생성한다
		try {
			boolean flag = file.createNewFile();
			System.out.println("파일생성 "+flag);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.exists());
		// 대상의 상위 디렉토리 정보를 문자열로 반환
		// a.txt 파일의 사우이 디렉토리 경로는?
		System.out.println(file.getParent());
		// 대상의 상위 디렉토리 정보를 File 객체로 반환
		System.out.println(file.getParentFile());
		//a.txt와 동일한 위치에 b.txt를 생성하고자 한다
		// file 객체의 상위 디렉토리를 알아내어 b.txt를 생성하기위해
		// File 객체를 생성하고 createNewFile()을 실행한다
		File bFile = new File(file.getParent()+File.separator+"b.txt");
		try {
			bFile.createNewFile();
			System.out.println("파일생성 " + bFile.getPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("************************");
		File listDir = new File("C:"+File.separator+"java-kosta"+File.separator+"test");
		System.out.println(listDir.isDirectory());
		//listDir 디렉토리에 존재하는 파일 목록을 출력해본다
		String list[] = listDir.list();
		for(int i=0;i<list.length;i++)
			System.out.println(list[i]);
		
	}
}
