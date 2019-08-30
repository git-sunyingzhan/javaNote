package se01.day06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 集合嵌套
 * 	个人的社会关系
 * 		家人：
 * 			父
 * 			母	
 * 		女朋友：
 * 			黑泽志林
 * 			苍井null
 */

class Person{
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class MapTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//社会关系
		Map<String, ArrayList<Person>> map = new HashMap<String, ArrayList<Person>>();
		//家人
		ArrayList<Person> fl = new ArrayList<Person>();
		fl.add(new Person("父亲"));
		fl.add(new Person("母亲"));
		
		map.put("家人", fl);
		
		//家人
		ArrayList<Person> gl = new ArrayList<Person>();
		gl.add(new Person("黑泽志林"));
		gl.add(new Person("苍井null"));
		
		map.put("女朋友", gl);
		
		//遍历
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
			ArrayList<Person> value = map.get(key);
			for (Person p :value) {
				System.out.println("  "+p.toString());
			}
		}
	}

}
