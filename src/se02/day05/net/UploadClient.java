package se02.day05.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class UploadClient {

	public static void main(String[] args) throws IOException {
		//创建客户端Socket
		Socket s = new Socket("127.0.0.1",12345);
		
		//创建输入流
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("images/scroll.png"));
		
		//封装通道流
		BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
		
		byte[] bys = new byte[1024];
		int len = 0;
		while((len=bis.read(bys))!=-1) {
			bos.write(bys, 0, len);
		}
		//通知服务器信息传输完毕
		s.shutdownOutput();
		
		//接收服务器的反馈信息
		byte[] buf = new byte[1024];
		int length = s.getInputStream().read(buf);
		System.out.println(new String(buf,0,length));
		
		//释放资源
		bis.close();
		s.close();
	}

}
