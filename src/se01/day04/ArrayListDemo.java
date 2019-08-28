package se01.day04;

import java.util.ArrayList;

/*
 * 创建一个ArrayList集合，在集合里面添加一些学生对象，遍历集合输出学生信息
 */

class Student{
	private String name;
	private int age;
	public Student() {
		
	}
	public Student(String name,int age) {
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

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("刘备",11);
		Student s2 = new Student("张飞",12);
		Student s3 = new Student("关羽",13);
		Student s4 = new Student("曹操",14);
		Student s5 = new Student("孙权",15);
		Student s6 = new Student("吕布",16);
		Student s7 = new Student("刘备",11);
		
		ArrayList alist = new ArrayList();
		alist.add(s1);
		alist.add(s2);
		alist.add(s3);
		alist.add(s4);
		alist.add(s5);
		alist.add(s6);
		alist.add(s7);
		
		for (int i = 0; i < alist.size(); i++) {
			Student s = (Student)alist.get(i);
			System.out.println(s);
		}
		
	}

}
