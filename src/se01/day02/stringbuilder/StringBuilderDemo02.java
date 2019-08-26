package se01.day02.stringbuilder;

public class StringBuilderDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("abc");
		//链式编程（调用方法返回一个对象继续调用方法）
		sb.append(100).append("ture").append('a');
		//插入
		//abc插入df
		sb.insert(3, "df");
		//容量
		System.out.println(sb.capacity());
		//长度
		System.out.println(sb.length());
		//删除最后一个字符
		sb.deleteCharAt(sb.length()-1);
		//删除100
		sb.delete(5, 8);
		//将true替换成false
		sb.replace(5, 9, "false");
		//反转
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder("abcdefg");
		//获取字符串“defg”
		String s2 = sb2.substring(3);
		System.out.println(s2);
		System.out.println(sb2);
		//截取"de"
		String s3 = sb2.substring(3, 5);
		System.out.println(s3);
	}

}
