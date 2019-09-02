package tips;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class writeTips {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/zhaixiaoyan/tips/java.txt",true));
		osw.write(s.concat("\n"));
		
		osw.close();
		scanner.close();
	}

}
