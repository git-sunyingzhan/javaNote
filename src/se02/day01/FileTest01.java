package se02.day01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * 获取当前项目下.java文件的个数，并打印java文件 
 */
public class FileTest01 {
	static int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File folder = new File(".");
		printJavaFile(folder);
		System.out.println(count);
		
//		File[] names = folder.listFiles();
//		getCounts(names);
	}

	private static void printJavaFile(File folder) {
		// TODO Auto-generated method stub
		//获取当前目录下的所有File对象
		File[] files = folder.listFiles();
		for (File file : files) {
			if(file.isDirectory()) {
				printJavaFile(file);
			}else {
				if(file.getName().endsWith(".java")) {
					System.out.println(file.getAbsolutePath());
					count ++;
				}
			}
		}
	}

	private static void getCounts(File[] names) {
		// TODO Auto-generated method stub
		int counts = 0;
		String s = null;
		List<String> list = new ArrayList<String>();
		for (File name : names) {
			s = name.toString();
			System.out.println(s);
			if (s.endsWith(".java")) {
				counts += 1;
			}
			
		}
	}

}
