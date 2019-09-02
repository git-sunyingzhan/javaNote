package tips;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class readTips {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(new FileInputStream("/Users/zhaixiaoyan/tips/java.txt"));
		char[] chs = new char[3];
		int len = 0;
		while((len=isr.read(chs))!=-1) {
			System.out.print(new String(chs,0,len));
		}
		
		isr.close();
	}

}
