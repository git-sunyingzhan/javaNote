package se02.day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//通过转换流将io/1.txt复制到images目录下
public class FileCharStringDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("io/1.txt");
		FileWriter fw = new FileWriter("images/1.txt");
		
		//读写一个字符数组
		char[] chs = new char[5];
		int len = 0;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs,0,len);
		}
		
		fw.close();
		fr.close();
	}

}
