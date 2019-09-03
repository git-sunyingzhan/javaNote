package se02.day03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		demo02();
	}

	private static void demo02() throws IOException {
		Properties prop = new Properties();
		prop.load(new FileInputStream("io/config.properties"));
		
		System.out.println(prop.getProperty("002"));
		
		prop.setProperty("addr", "江苏苏州");
		
		prop.store(new FileOutputStream("io/config.properties"), "lalalal");
		
		
	}

	private static void demo01() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		
		prop.setProperty("001", "张三");
		prop.setProperty("002", "李四");
		prop.setProperty("003", "王五");
		prop.setProperty("004", "小二");
		
		System.out.println(prop);
		System.out.println(prop.getProperty("002"));
		
		Set<String> keys = prop.stringPropertyNames();
		for (String key : keys) {
			System.out.print(key+":"+prop.getProperty(key) +" ");
		}
		
		prop.store(new FileOutputStream("io/config.properties"), null);
		
		
	}

}
