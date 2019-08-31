package se02.day01;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 通过文件名称过滤器获取当前项目的所有.class文件的文件名
 */
public class FileDeno04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//封装目录
		File file = new File(".");
		printFile(file);
	}

	private static void printFile(File file) {
		// TODO Auto-generated method stub
		//通过过滤器获取目录下满足条件的所有File
		File[] files = file.listFiles(new FilenameFilter() {
			
			@Override
			//dir - 被找到的文件/文件夹所在的目录。
			//name：文件/文件夹的名称
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File file = new File(dir,name);
				//如果是文件夹，继续查找该文件夹下的文件
				if(file.isDirectory()) {
					printFile(file);
				}
				//如果是文件，查看是否是.class文件
				return name.endsWith(".txt");
			}
		});
		for (File f : files) {
			System.out.println(f.getName());
		}
	}

}
