package se01.day04;

//泛型类
class ObjectDemo<E>{
	private E e;

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}
}
public class GenericDemo03 {
	public static void main(String[] args) {
		//在创建对象的时候再明确泛型的具体类型
		ObjectDemo<String> od1 = new ObjectDemo<String>();
		od1.setE("fsafa");
		String s = od1.getE();
		System.out.println(s);
		
		ObjectDemo<Integer> od2 = new ObjectDemo<Integer>();
		od2.setE(100);
		System.out.println(od2.getE());
	}
}
