package se02.day06.annotation;

class Doo{
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Deprecated
	public void show() {
		System.out.println("show");
	}

}
public class AnnoDemo {

	public static void main(String[] args) {
		new Doo().show();
	}

}
