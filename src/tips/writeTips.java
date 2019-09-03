package tips;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeTips {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		FileWriter fw = new FileWriter("/Users/zhaixiaoyan/tips/java.txt",true);
		fw.write(s);
		
		
		fw.close();
		scanner.close();
	}

}
