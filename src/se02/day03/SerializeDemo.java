package se02.day03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		demo01();
//		demo02();
		demo03();
	}

	/**
	 * 将对象写出到内存中
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	private static void demo03() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		Dog d = new Dog("小黄",1);
		d.setOwern(new Person("小明"));
		
		
		
		d.setPartner(new Cat("Tom",2));
		
		oos.writeObject(d);
		
		oos.close();
		baos.close();
		
		byte[] bys = baos.toByteArray();
		
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);
		ObjectInputStream ois = new ObjectInputStream(bais);
		
		Dog cDog =(Dog)ois.readObject();
		System.out.println(cDog.toString());
		
		ois.close();
		bais.close();
	}

	private static void demo02() throws IOException, ClassNotFoundException{
		//返序列化流
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io2/dog.txt"));
		
		//读取文本文件中写入的对象的字节数据，将其还原成对象
		Dog d = (Dog)ois.readObject();
		System.out.println(d);
		
		//关闭流
		ois.close();
	}

	private static void demo01() throws IOException {
		Dog d = new Dog("大黄",1);
		//序列化流
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io2/dog.txt"));
		
		//将对象写出到文本文件中
		oos.writeObject(d);
		
		//释放资源
		oos.close();
	}

}
