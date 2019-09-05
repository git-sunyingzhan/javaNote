package se02.day05.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 获取成员方法并使用
 */
public class ReflectDemo04 {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("se02.day05.reflect.Person");
		
		//获取当前类及父类里面所有公共的成员方法
		Method[] m = c.getMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		
		System.out.println("------------------------");
		
		//获取当前类中所有的成员方法
		Method[] ms = c.getDeclaredMethods();
		for (Method method : ms) {
			System.out.println(method);
		}
		
		//创建对象
		Constructor constructor = c.getConstructor();
		Person p = (Person) constructor.newInstance();
		
		//获取单个方法
		Method mt = c.getMethod("show");
		System.out.println(mt);
		
		mt.invoke(p);
		
		//获取method并调用
		Method method = c.getDeclaredMethod("method");
		method.setAccessible(true);
		method.invoke(p);
		
		//获取getMax并调用
		Method getMax = c.getMethod("getMax", int.class,int.class);
		
		int max = (int) getMax.invoke(p,1, 2);
		System.out.println(max);
		
	}

}
