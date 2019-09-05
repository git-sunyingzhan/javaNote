package se02.day05.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {
		//创建服务器Socket
		ServerSocket ss = new ServerSocket(12345);
		
		while(true) {
			//侦听客户端连接
			Socket s = ss.accept();
			
			//封装通道流
			BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
			
			//创建输出流
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("io2/1.png"));
			
			//将客户端上传到指定的文件中
			byte[] bys = new byte[1024];
			int len = 0;
			while((len=bis.read(bys))!=-1) {
				bos.write(bys, 0, len);
			}
			
			//给客户端一个反馈
			OutputStream os = s.getOutputStream();
			byte[] massage = "上传成功！".getBytes();
			os.write(massage);
			
			//释放资源
			bos.close();
			s.close();
			os.close();
		}
	}

}
