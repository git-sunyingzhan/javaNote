package se01.day04;


interface Inter<T>{
	void show(T t);
}

//实现类
//1、知道实现什么泛型
class InterImple1 implements Inter<String>{

	@Override
	public void show(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
	
}

//2、不知道实现什么泛型
class InterImple2<T> implements Inter<T>{

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}
public class GenericDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		Inter<String> i = new InterImple1();
		i.show("fass");
		
		//2
		Inter<Integer> i2 = new InterImple2<Integer>();
		i2.show(101);
	}

}
