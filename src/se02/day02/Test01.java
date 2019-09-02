package se02.day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//将项目下images目录中的1.png复制到io目录下
public class Test01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("images/scroll.png");
		FileOutputStream fos = new FileOutputStream("io/scroll.png",true);
		
		//方式一：每次读取一个字节
//		int by = 0;
//		while((by=fis.read())!=-1){
//			fos.write(by);
//		}
		
		//方式二：每次读写一个字节数组(开发中，字节数组长度为1024或其倍数)。
		byte[] buf = new byte[1024];
		int len = 0;//每次读出度字节个数
		while((len=fis.read(buf))!=-1) {
			fos.write(buf,0,len);
		}
		
		//释放资源
		fos.close();
		fis.close();
	}

}
