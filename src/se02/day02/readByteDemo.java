package se02.day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 使用字节流读io/2.txt
 * 使用字节流读含有中文读数据，可能出现乱码
 */
public class readByteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		readByte();
		readChar();
	}

	private static void readChar() throws IOException {
		// TODO Auto-generated method stub
		//字节流输入对象
		InputStreamReader isr = new InputStreamReader(new FileInputStream("io/3.txt"),"utf-8");
		
		//读一个数组
		char[] chs = new char[3];
		int len = 0;
		while((len=isr.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		
		isr.close();
		
	}

	private static void readByte() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("io/2.txt");
		
		byte[] bys = new byte[3];
		int len = 0;
		while((len=fis.read(bys))!=-1) {
			System.out.print(new String(bys,0,len));
		}
		
		fis.close();
	}

}
