package se01.day05;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("hfw");
		lhs.add("董建华说");
		lhs.add("cbwj");
		lhs.add("dvdnjbs");
		lhs.add("ej8349");
		lhs.add("fhfas");
		lhs.add("gfhs");
		lhs.add("b");
		lhs.add("b");
		for (String string : lhs) {
			System.out.println(string);
		}
	}

}
