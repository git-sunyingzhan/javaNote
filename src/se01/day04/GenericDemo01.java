package se01.day04;

/*
 * 泛型的由来
 */

class Foo{
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}
public class GenericDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo foo = new Foo();
		foo.setObject("abc");
		String s = (String)foo.getObject();
		System.out.println(s);

	}

}
