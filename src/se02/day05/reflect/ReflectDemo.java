package se02.day05.reflect;

//获取字节码文件对方式
public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		//方式一
		Person p = new Person();
		Class<? extends Person> class1 = p.getClass();
		System.out.println(class1);
		
		//方式二
		Class class2 = Person.class;
		System.out.println(class2);
		
		//方式三
		Class class3 = Class.forName("se02.day05.reflect.Person");
		System.out.println(class3);
	}

}
