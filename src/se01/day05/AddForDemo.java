package se01.day05;

import java.util.ArrayList;
import java.util.List;

public class AddForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组遍历
		String[] arr = {"a","b","c"};
		for (String s : arr) {
			System.out.println(s);
		}
		
		//集合遍历
		List<Character> list = new ArrayList<Character>();
		list.add('a');
		list.add('b');
		list.add('c');
		
		for (Character c : list) {
			System.out.println(c);
		}
	}

}
