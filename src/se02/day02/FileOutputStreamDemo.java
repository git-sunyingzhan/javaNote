package se02.day02;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//文件字节输出流
		FileOutputStream fos = new FileOutputStream("io/1.txt");
		//写入一个字节
		fos.write(97);
		fos.write('A');
		//写入一个字节数组
		byte[] bys = {97,98,99,100};
		fos.write(bys);
		//写入字节数组中的一部分
		fos.write(bys, 0, 3);
		
		//关闭流对象
		fos.close();
		
	}

}
