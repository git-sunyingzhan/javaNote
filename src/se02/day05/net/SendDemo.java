package se02.day05.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * 发送端
 */
public class SendDemo {

	public static void main(String[] args) throws IOException {
		//创建发送端套接字Socket
		DatagramSocket ds = new DatagramSocket();
		
		//封装键盘录入数据
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line=bReader.readLine())!=null) {
			//结束条件
			if("886".equals(line)) {
				break;
			}
			//创建数据并打包
			byte[] bys = line.getBytes();
			DatagramPacket dp = new DatagramPacket(bys, bys.length,InetAddress.getByName("localhost"),8888);
			
			//发送数据
			ds.send(dp);
		}
		
		//释放资源
		ds.close();
	}

}
