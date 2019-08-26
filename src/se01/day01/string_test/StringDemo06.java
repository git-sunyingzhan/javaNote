package se01.day01.string_test;

public class StringDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123中国123";
		//'3'替换成‘1’
		String s1 = s.replace('3', '1');
		System.out.println(s1);
		//"中国"替换成“CHINA”
		String s2 = s.replace("中国", "CHINA");
		System.out.println(s2);
		//去除两边空格
		String s3 = " ad min ".trim();
		System.out.println(s3);
		
		//字典比较
		s1 = "abc";
		s2 = "cba";
		s3 = "abcde";
		//拿当前字符串里面元素依次和参数字符串元素进行比较
		//如果元素不想等，返回元素的差值
		System.out.println(s1.compareTo(s2));
		//如果参数字符串以当前字符串开始，比较它们的长度差
		System.out.println(s1.compareTo(s3));
	}

}
