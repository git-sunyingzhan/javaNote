package se02.day01;

import java.io.File;

public class FileDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取demo目录下的所有文件和文件夹名称
		File file = new File("demo");
		String[] names = file.list();
		for (String name : names) {
			System.out.println(name);
		}
		
		//demo目录下的所有文件和文件夹的File
		File[] files = file.listFiles();
		for (File file2 : files) {
			System.out.println(file2);
		}
		
	}

}
