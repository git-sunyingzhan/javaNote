package se02.day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * 归档：将多个文件合并成一个文件
 * 规则：
		1）先写入文件名长度4个字节
		2）写入文件名
		3）写入文件内容字节数的四个字节
		4）写入文件内容
		5）按照上面的4个步骤写入相应的步骤
 */
public class PlaceDemo {
	public static void main(String[] args) throws IOException {
		File folder = new File("place");
		if (!folder.exists()) {
			System.out.println("目标文件夹是空文件夹");
		} else {
			File[] files = folder.listFiles();
			for (File file : files) {
				place(file);
			}
		}
	}

	private static void place(File file) throws IOException {
		FileOutputStream placeFile = new FileOutputStream("placeFile/placeFile.txt", true);
		
		String fileName = file.getName();
		// 写入文件名长度四个字节
		int fileNameLen = fileName.length();
		byte[] bys = int_byte(fileNameLen);
		placeFile.write(bys);
		
		//写入文件名
		placeFile.write(fileName.getBytes());
		
		//写入文件内容字节数的四个字节
		long fileSize = file.length();
		placeFile.write(int_byte((int)fileSize));
		
		//写入文件内容
		FileInputStream fis = new FileInputStream(file);
		bys = new byte[1024];
		int len = 0;
		while((len=fis.read(bys))!=-1) {
			placeFile.write(bys,0,len);
		}
		
		//关闭资源
		fis.close();
		placeFile.close();
	}

	//int类型转byte数组
	public static byte[] int_byte(int id) {
		// int是32位 4个字节 创建length为4的byte数组
		byte[] arr = new byte[4];

		arr[0] = (byte) ((id >> 0 * 8) & 0xff);
		arr[1] = (byte) ((id >> 1 * 8) & 0xff);
		arr[2] = (byte) ((id >> 2 * 8) & 0xff);
		arr[3] = (byte) ((id >> 3 * 8) & 0xff);

		return arr;
	}

	//byte数组转int
	public static int byte_int(byte[] arr) {
		int i0 = (int) ((arr[0] & 0xff) << 0 * 8);
		int i1 = (int) ((arr[1] & 0xff) << 1 * 8);
		int i2 = (int) ((arr[2] & 0xff) << 2 * 8);
		int i3 = (int) ((arr[3] & 0xff) << 3 * 8);

		return i0 + i1 + i2 + i3;
	}
}
