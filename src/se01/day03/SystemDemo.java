package se01.day03;

class Student{
	String name;
	int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("垃圾被清理了。");
	}
}

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("小明",11);
		s = null;
		System.gc();
		//JVM退出
		//System.exit(0);
		System.out.println("over");
	}

}
