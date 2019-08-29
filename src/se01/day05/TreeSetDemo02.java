package se01.day05;

import java.util.TreeSet;

class Dog implements Comparable<Dog> {
	String name;
	int age;
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		//先比较年龄(由小到大)
		int num = this.age-o.age;
		//如果年龄相同	，按照姓名的字典顺序进行排序
		int num2 = num==0?(this.name.compareTo(o.name)):num;
		return num2;
	}
	
}
public class TreeSetDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Dog> ts = new TreeSet<Dog>();
		ts.add(new Dog("小黄",1));
		ts.add(new Dog("小黑",2));
		ts.add(new Dog("小花",3));
		ts.add(new Dog("小白",1));
		ts.add(new Dog("小绿",5));
		ts.add(new Dog("小黄",1));
		
		for (Dog dog : ts) {
			System.out.println(dog.toString());
		}
		
	}

}
