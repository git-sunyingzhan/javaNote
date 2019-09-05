package se02.day05.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

/*
 * 客户端（TCP）
 */
public class ClientDemo {

	public static void main(String[] args) throws IOException {
		//创建客户端Socket
		Socket s = new Socket("127.0.0.1",10086);
		
		//数据来自文件
		BufferedReader br = new BufferedReader(new FileReader("io/6.txt"));
		
		//获取输出流并封装成缓冲字符输出流
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		//将文件内数据写出到服务器
		String line = null;
		while((line = br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//释放资源
		br.close();
		s.close();
	}

}
