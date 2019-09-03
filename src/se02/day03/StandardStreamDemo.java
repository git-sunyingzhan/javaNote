package se02.day03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class StandardStreamDemo {

	public static void main(String[] args) throws IOException {
		demo03();
	}

	/**
	 * 重新分配标准输入输出流，从1.txt读写6.txt
	 * @throws IOException 
	 */
	private static void demo03() throws IOException {
		System.setIn(new FileInputStream("io/1.txt"));
		System.setOut(new PrintStream("io/6.txt"));
		//获取“标准”输入输出流
		InputStream is = System.in;
		PrintStream ps = System.out;
		
		//读写
		int by = 0;
		while((by=is.read())!=-1) {
			ps.write(by);
		}
		
		ps.close();
		is.close();
		
	}

	private static void demo02() throws NumberFormatException, IOException {
		//标准输入流封装成缓冲字符输入流
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入一个整形：");
		System.out.println(Integer.parseInt(bReader.readLine()));
		
		bReader.close();
	}

	private static void demo01() throws IOException {
		//获取标准输入流
		InputStream is = System.in;
		System.out.println("请输入一个数据：");
		
		System.out.println(is.read());
		
		is.close();
	}

}
