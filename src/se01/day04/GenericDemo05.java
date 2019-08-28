package se01.day04;

class Doo{
	public <T> void show(T t) {
		System.out.println(t);
	}
}
public class GenericDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doo doo = new Doo();
		doo.show("小明");
		doo.show(100);
	}

}
