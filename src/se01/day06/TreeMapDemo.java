package se01.day06;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Dog{
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
	
}
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Dog, String> map = new TreeMap<Dog, String>(new Comparator<Dog>() {

			@Override
			public int compare(Dog o1, Dog o2) {
				// TODO Auto-generated method stub
				return -o1.age-o2.age;
			}
		});
		
		map.put(new Dog("小黄",1), "中华田园犬");
		map.put(new Dog("小白",2), "阿拉斯加");
		map.put(new Dog("小黑",3), "泰迪");
		map.put(new Dog("小花",3), "土狗");
		
		//遍历
		Set<Entry<Dog,String>> key = map.entrySet();
		
		for (Entry<Dog, String> k : key) {
			System.out.println(k.getKey()+"---"+k.getValue());
		}
	}

}
