package se02.day03;

import java.io.Serializable;

public class Cat implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4487370524675321984L;
	private String name;
	private int age;
	private Person owern;
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owern == null) ? 0 : owern.hashCode());
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
		Cat other = (Cat) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (owern == null) {
			if (other.owern != null)
				return false;
		} else if (!owern.equals(other.owern))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", owern=" + owern + "]";
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
	public Person getOwern() {
		return owern;
	}
	public void setOwern(Person owern) {
		this.owern = owern;
	}
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
}
