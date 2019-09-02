package se02.day02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 字节流和缓冲字节流的读写速度
 */
public class BufferedByteStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getTime();
		getTime2();
	}

	//字节流读写速度
	private static void getTime2() throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("io/1.txt");
		OutputStream os = new FileOutputStream("io/2.txt");
		long old = System.currentTimeMillis();
		
		//每次读写1个字节
//		int by = 0;
//		while((by=is.read())!=-1) {
//			os.write(by);
//		}
		
		//每次读写一个字节数组
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=is.read(buf))!=-1) {
			os.write(buf, 0, len);
		}
		
		long now = System.currentTimeMillis();
		//释放资源
		os.close();
		is.close();
		
		System.out.println(now-old);
		
	}

	//缓冲字节流读写速度
	private static void getTime() throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bif = new BufferedInputStream(new FileInputStream("io/1.txt"));
		BufferedOutputStream bof = new BufferedOutputStream(new FileOutputStream("io/3.txt"));
		long old = System.currentTimeMillis();
		
		//一次读一个字节
//		int by = 0;
//		while((by=bif.read())!=-1) {
//			bof.write(by);
//		}
		
		//一次读一个字节数组
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=bif.read(buf))!=-1) {
			bof.write(buf, 0, len);
		}
		
		long now = System.currentTimeMillis();
		
		//释放资源
		bof.close();
		bif.close();
		
		System.out.println(now-old);
	}

}
