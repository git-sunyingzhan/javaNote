package se01.day02.stringbuilder;

public class StringBuilderDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello";
		String s2 = "word";
		System.out.println("change前：s1="+s1+",s2="+s2);
		change(s1,s2);
		System.out.println("change后：s1="+s1+",s2="+s2);
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		change(sb1, sb2);
		System.out.println("change后：s1="+sb1+",s2="+sb2);
	}

	private static void change(StringBuilder sb1, StringBuilder sb2) {
		// TODO Auto-generated method stub
		sb2.append(sb1);
	}

	private static void change(String s1, String s2) {
		// TODO Auto-generated method stub
		s2 += s1;
		System.out.println(s2);
	}

}
