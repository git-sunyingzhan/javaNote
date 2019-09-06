package se02.day06.jdk8;

import java.util.Arrays;
import java.util.Comparator;

class Student{
	private String name;
	private int age;
	public Student() {
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
public class LambdaDemo03 {

	public static void main(String[] args) {
		Student[] stus = {
				new Student("张三",11),
				new Student("李四",12),
				new Student("王五",13),
				new Student("小丽",14),
		};
		
		compoter2(stus);
	}

	private static void compoter2(Student[] stus) {
		Arrays.sort(stus,(a,b)->b.getAge()-a.getAge());
		System.out.println(Arrays.toString(stus));
	}

	private static void compoter1(Student[] stus) {
		Arrays.sort(stus,new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s2.getAge()-s1.getAge();
			}
		});
		
		System.out.println(Arrays.toString(stus));
	}

}
