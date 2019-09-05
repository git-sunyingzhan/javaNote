package se02.day05.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

//获取构造方法
public class ReflectDemo03 {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("se02.day05.reflect.Person");
		
		//获取所有公共的构造方法
		Constructor[] constructors = c.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		
		//获取所有构造方法
		Constructor[] constructors2 = c.getDeclaredConstructors();
		for (Constructor constructor : constructors2) {
			System.out.println(constructor);
		}
		
		//获取指定的某个构造
		Constructor con1 = c.getConstructor();
		System.out.println(con1);
		
		Constructor con2 = c.getDeclaredConstructor(String.class,int.class);
		System.out.println(con2);
		
		//通过构造创建对象
		Person p1 =  (Person) con1.newInstance();
		System.out.println(p1);
		
		Person p2 = (Person) con2.newInstance("张三",11);
		System.out.println(p2);
		
		//获取address的值
		Field address = c.getField("address");
		//设置字段的值
		address.set(p2, "苏州");
	}

}
