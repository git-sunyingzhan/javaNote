package se01.day05;

import java.util.HashSet;

/*
 * 创建HashSet<String>,添加Student时候，存在两个相等的Student对象。添加元素之后，使用增强for遍历集合，输出所有对象信息
 */

class Student {
	String name;
	int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

public class HashSetDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student("小明",11));
		hs.add(new Student("小王",12));
		hs.add(new Student("小张",13));
		hs.add(new Student("小红",14));
		hs.add(new Student("小明",11));
		
		for(Student s:hs) {
			System.out.println(s);
		}
	}

}
