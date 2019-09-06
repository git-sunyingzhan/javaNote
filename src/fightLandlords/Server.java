package fightLandlords;

import java.io.IOException;
import java.net.ServerSocket;

/*
 * 服务端（UDP）
 */
public class Server {

	public static void main(String[] args) {
		//启动服务端
		ServerSocket ss = ServerRun(8888);
		
		try {
			ss.accept();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//启动服务端
	private static ServerSocket ServerRun(int port) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(port) {
				@Override
				public String toString() {
					return super.toString();
				}
			};
		} catch (IOException e) {
			System.out.println("端口被占用。");
			System.out.println("5秒后更换其他端口。。。。。");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			ServerRun(port++);
		}
		return ss;
	}
}
