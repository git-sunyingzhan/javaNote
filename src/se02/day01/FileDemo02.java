package se02.day01;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//在当前项目的io目录下创建1.txt
		File file = new File("io//1.txt");
		file.createNewFile();
		
		//获取绝对路径
		System.out.println(file.getAbsolutePath());
		//获取相对路径
		System.out.println(file.getPath());
		//获取父对象
		System.out.println(file.getParent());
		//获取名称
		System.out.println(file.getName());
		//获取字节数
		System.out.println(file.length());
		//获取最后一次修改的时间毫秒值
		long time = file.lastModified();
		Date date = new Date(time);
		String s = new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(date);
		System.out.println(s);
	}

}
