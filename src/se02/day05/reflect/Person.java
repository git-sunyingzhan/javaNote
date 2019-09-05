package se02.day05.reflect;

public class Person {
	private String name;
	int age;
	public String address;
	public Person() {
	}
	private Person(String name) {
		this.name = name;
	}
	private Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name,int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void show() {
		System.out.println("show");
	}
	
	private void method() {
		System.out.println("method");
	}
	
	public void fun(String s) {
		System.out.println(s);
	}
	
	public int getMax(int a,int b) {
		return a>b?a:b;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
