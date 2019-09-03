package se02.day03;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException {
//		demo01();
//		demo02();
		demo03();
		
	}

	
	private static void demo03() throws IOException {
		RandomAccessFile raFile = new RandomAccessFile("io/5.txt", "rw");
		System.out.println(raFile.readInt());
		System.out.println(raFile.getFilePointer());
		System.out.println(raFile.readChar());
		System.out.println(raFile.getFilePointer());
		System.out.println(raFile.readUTF());
		System.out.println(raFile.getFilePointer());
		
		raFile.close();
	}


	private static void demo02() throws IOException {
		RandomAccessFile raFile = new RandomAccessFile("io/5.txt", "rw");
		raFile.writeInt(100);
		raFile.writeChar('你');
		raFile.writeUTF("还好吗");
		raFile.close();
		
	}


	private static void demo01() throws IOException {
		RandomAccessFile raFile = new RandomAccessFile("io/5.txt", "rw");
		
		raFile.write(97);
		int by = raFile.read();
		System.out.println(by);
		
		//设置读操作位置
		raFile.seek(0);
		System.out.println(raFile.read());
		
		raFile.close();
	}

}
