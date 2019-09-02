package se02.day02;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 使用字符流将io/2.txt里面的内容追加写入到1.txt中
 */
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = null;
		OutputStreamWriter osw = null;
		
		try {
			
			isr = new InputStreamReader(new FileInputStream("io/2.txt"));
			osw = new OutputStreamWriter(new FileOutputStream("io/1.txt",true));
			
			int len = 0;
			while((len=isr.read())!=-1) {
				osw.write(len);
			}
			
		}catch (FileNotFoundException e) {
			System.out.println("文件找不到");
		}catch (IOException e) {
			System.out.println("读写有问题");
		}finally {
			//释放资源
			if(osw!=null) {
				try {
					osw.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(isr!=null) {
				try{
					isr.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
