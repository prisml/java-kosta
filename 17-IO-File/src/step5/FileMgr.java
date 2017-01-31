package step5;

import java.io.File;

public class FileMgr {
	/*
	 * path�� �ش��ϴ� ���� ��ο� ������ ���丮�� �ִ�
	 * ���ϵ��� �̸�(Ȯ���� ����)�� ����Ѵ�(���丮�� �����Ѵ�)
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
