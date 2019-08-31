package se02.day01;

import java.io.File;

/*
 * 删除当前项目下的demo目录
 */
public class FileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("demo");
		deleteFile(file);
	}

	private static void deleteFile(File folder) {
		// TODO Auto-generated method stub
		File[] files = folder.listFiles();
		if(files==null) {
			folder.delete();
		}else {
			for (File file2 : files) {
				if (file2.isFile()) {
					file2.delete();
				}else {
					deleteFile(file2);
				}
			}
			folder.delete();
		}

	}

}
