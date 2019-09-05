package se02.day05.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务端（TCP）
 */
public class ServerDemo {

	public static void main(String[] args) throws IOException {
		//创建服务器套接字
		ServerSocket ss = new ServerSocket(10086);
		
		//侦听客户端连接
		Socket s = ss.accept();
		
		//将输入流装饰成缓冲字符输入流
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		
		//释放资源
		s.close();
		ss.close();
	}

}
