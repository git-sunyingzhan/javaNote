package se02.day03;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//内存输出流
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		//文件输入流
		FileInputStream fis = new FileInputStream("io/1.txt");
		
		//读一个字节
		int by = 0;
		while((by=fis.read())!=-1) {
			baos.write(by);
		}

		//关闭流对象
		fis.close();
		baos.close();
		
		//1)获取缓冲区里面到数据
		byte[] buf = baos.toByteArray();
		System.out.println(new String(buf));
		
		//2）获取缓冲区数据到字符串表示
		System.out.println(baos.toString());
		
		
	}

}
