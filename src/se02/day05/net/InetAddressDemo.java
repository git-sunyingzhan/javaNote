package se02.day05.net;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		//获取InetAddress对象
		InetAddress address = InetAddress.getByName("");
		System.out.println(address.getLocalHost());
		
	}

}
