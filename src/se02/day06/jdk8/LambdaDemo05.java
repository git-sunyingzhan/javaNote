package se02.day06.jdk8;

@FunctionalInterface
interface MessageBuilder{
	String append();
}
public class LambdaDemo05 {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		
		//如果等级不满足，s1+s2还需要执行，性能浪费
		show("1",s1+s2);
		
		//只有当等级满足条件，才会调用append方法，才会执行Lambda表达式
		newShow("2",()->s1+s2);
	}

	private static void show(String level, String msg) {
		if("1".equals(level)) {
			System.out.println(msg);
		}
	}
	
	public static void newShow(String level,MessageBuilder mb) {
		if("1".equals(level)) {
			System.out.println(mb.append());
		}
	}
}
