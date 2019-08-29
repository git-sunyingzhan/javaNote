package se01.day05;

import java.util.Comparator;
import java.util.TreeSet;

class Cat{
	String name;
	int age;
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	
}
public class TreeSetDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个具有比较器的TreeSet
		TreeSet<Cat> ts = new TreeSet<Cat>(new Comparator<Cat>() {

			@Override
			public int compare(Cat c1, Cat c2) {
				// TODO Auto-generated method stub
				return c2.age-c1.age;
			}
			
		});
		ts.add(new Cat("小花", 1));
		ts.add(new Cat("小黄",1));
		ts.add(new Cat("小黑",2));
		ts.add(new Cat("小花",3));
		ts.add(new Cat("小白",1));
		ts.add(new Cat("小绿",5));
		ts.add(new Cat("小黄",1));
		
		for (Cat cat : ts) {
			System.out.println(cat);
		}
	}

}
