package se02.day05.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * 接收端(UDP)
 */
public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		//创建接收端的Socket
		DatagramSocket dSocket = new DatagramSocket(8888);
		while(true) {	
			//创建一个包裹
			byte[] bys = new byte[1024];
			DatagramPacket dPacket = new DatagramPacket(bys, bys.length);
			
			//接收数据
			dSocket.receive(dPacket);
			
			//解析数据
			String ip = dPacket.getAddress().getHostAddress();
			int port = dPacket.getPort();
			
			String s = new String(dPacket.getData(),0,dPacket.getLength());
			
			
			System.out.println("from "+ip+":"+port+" data is "+s);
		}
		
		//dSocket.close();
	}

}
