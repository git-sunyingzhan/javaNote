package se01.day05;

import java.util.TreeSet;

public class TreeDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(11);
		ts.add(18);
		ts.add(13);
		ts.add(14);
		ts.add(14);
		
		for(Integer i:ts) {
			System.out.println(i);
		}
	}

}
