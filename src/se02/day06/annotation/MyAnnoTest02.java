package se02.day06.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import se02.day05.reflect.Person;

/*
 * 使用注解、反射创建一个实例，并调用方法
 */
@Config(className = "se02.day05.reflect.Person",methodName = "show")
public class MyAnnoTest02 {

	public static void main(String[] args) throws Exception {
		//获取定义在类上的注解
		Class<Annotation> c = Annotation.class;
		Config config = c.getAnnotation(Config.class);
		//通过注解获取属性值
		String className = config.className();
		String methodName = config.methodName();
		
		//获取字节码文件
		Class class1 = Class.forName(className);
		
		//获取构造，创建对象
		Constructor constructor = class1.getConstructor();
		Person p = (Person) constructor.newInstance();
		
		//获取方法并调用
		Method m = class1.getMethod(methodName);
		
		m.invoke(p);
		
	}

}
