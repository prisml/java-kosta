package step5;

import java.io.File;

public class FileMgr {
	/*
	 * path에 해당하는 파일 경로와 동일한 디렉토리에 있는
	 * 파일들의 이름(확장자 제외)을 출력한다(디렉토리는 제외한다)
	 */
	public void printFileNameNoExt(String path) {
		File f = new File(path);
		File dir = f.getParentFile();
		File[] list = dir.listFiles();
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isFile())
				System.out.println(list[i].getName().substring(0, list[i].getName().lastIndexOf(".")));
		}
	}

}
