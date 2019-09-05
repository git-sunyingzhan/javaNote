package se02.day05.reflect;

import java.lang.reflect.Field;

//通过反射获取成员变量
public class ReflectDemo02 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class c = Class.forName("se02.day05.reflect.Person");
		
		//获取所有公共对成员变量
		Field[] fileds = c.getFields();
		for (Field field : fileds) {
			System.out.println(field);
		}
		
		//获取所有对成员变量
		Field[] fields = c.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		//获取指定对某个成员变量
		Field address = c.getField("address");
		System.out.println(address);
		
		Field name = c.getDeclaredField("name");
		System.out.println(name);

	}

}
