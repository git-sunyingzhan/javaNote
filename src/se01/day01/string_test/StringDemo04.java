package se01.day01.string_test;

//判断功能
public class StringDemo04 {
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "AbcDe";
		String s3 = "abcde";
		//equals
		System.out.println(s1.equals(s2));//f
		System.out.println(s1.equals(s3));//t
		
		//忽略大小写比较
		System.out.println(s1.equalsIgnoreCase(s2));//t
		System.out.println(s1.equalsIgnoreCase(s3));//t
		
		//s1是否包含“aba”
		
		System.out.println(s1.contains("aba"));//f
		
		//s1是否以“ab”开头
		System.out.println(s1.startsWith("ab"));//f
		//s3是否以s1结尾
		System.out.println(s3.endsWith(s1));//t
		//s1是否为空
		System.out.println(s1.isEmpty());//f
	}
}
