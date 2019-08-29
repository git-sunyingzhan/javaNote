package se01.day05;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建hashset对象
		HashSet<String> hs = new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("a");
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
