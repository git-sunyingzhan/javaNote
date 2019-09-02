package se02.day02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 通过字符缓冲流将io/4.txt复制到images目录下，并将文件重命名为4c.txt
 */
public class BufferedCharStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new FileReader("io/4.txt"));
		BufferedWriter bWriter = new BufferedWriter(new FileWriter("images/4c.txt",true));
		
		//方式一：每次读写一个字符
//		int ch = 0;
//		while((ch=bReader.read())!=-1) {
//			bWriter.write(ch);
//		}
		
		//方式二：每次读写一个数组
//		char[] chs = new char[3];
//		int len = 0;
//		while((len=bReader.read(chs))!=-1) {
//			bWriter.write(chs,0,len);
//		}
		
		//方式三：每次读写一行数据
		String line = null;
		while((line=bReader.readLine())!=null) {
			bWriter.write(line);
			bWriter.newLine();
			bWriter.flush();//当数据量过大时，如果不加flush可能造成卡顿、死机。
		}
		
		//释放资源
		bWriter.close();
		bReader.close();
	}

}
