package se02.day01;

import java.io.File;

/*
 * 在D盘创建1.txt文件
 */
public class FileDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Users/zhaixiaoyan/eclipse-workspace/1.txt");
		file.mkdir();
	}

}
