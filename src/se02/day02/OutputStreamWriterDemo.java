package se02.day02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//字符输出流
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("io/3.txt",true));
		//写入一个字符
		osw.write('a');
		
		//写入一个字符数组
		char[] chs = {'今','天','不','开','心'};
		osw.write(chs);
		
		//写入字符数组中的一部分
		osw.write(chs, 1, 3);
		
		//写入一个字符串
		String s = "能否能看到女女款v 把 vu 规划 iu人刚好如果不妇科病 v 人\n";
		osw.write(s);
		
		osw.write("hello", 0, 2);
		
		osw.close();
	}

}
