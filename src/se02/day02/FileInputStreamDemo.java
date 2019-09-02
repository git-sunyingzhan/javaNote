package se02.day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//文件字节输入流
		FileInputStream fis = new FileInputStream("io/1.txt");
		System.out.println(fis.available());
		
		//方式一：读一个字节
//		int by = 0;
//		while((by=fis.read())!=-1) {
//			System.out.print((char)by);
//		}
		
		//方式二：
//		byte[] bys = new byte[5];
//		int len = fis.read(bys);
//		
//		System.out.println(len);
//		System.out.println(Arrays.toString(bys));
//		System.out.println(new String(bys));
		
		int len = 0;//读出的字节个数
		byte[] bys = new byte[5];
		while((len=fis.read(bys))!=-1) {
			System.out.println(new String(bys,0,len));
		}
		
		fis.close();
	}

}
