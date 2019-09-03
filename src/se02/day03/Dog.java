package se02.day03;

import java.io.Serializable;

//需要序列化的对象所对应的类需要实现序列化接口
public class Dog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6065870804275702558L;
	/**
	 * UID:当类修改后，能够进行反序列化
	 */
	String name;
	int age;
	private Cat partner;
	//	traninsent:临时的，阻止序列化
	private transient Person owern;
	
	public Cat getPartner() {
		return partner;
	}
	public void setPartner(Cat partner) {
		this.partner = partner;
	}
	public Person getOwern() {
		return owern;
	}
	public void setOwern(Person owern) {
		this.owern = owern;
	}
	public Dog() {
		
	}
	public Dog(String name, int age) {
		super();
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
		return "Dog [name=" + name + ", age=" + age + ", partner=" + partner + ", owern=" + owern + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((owern == null) ? 0 : owern.hashCode());
		result = prime * result + ((partner == null) ? 0 : partner.hashCode());
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
		Dog other = (Dog) obj;
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
		if (partner == null) {
			if (other.partner != null)
				return false;
		} else if (!partner.equals(other.partner))
			return false;
		return true;
	}

}
