package se02.day06.annotation;

@MyAnno01(age = 10,name = "张三",mm = MyMath.GT,ma2 = 
@MyAnno02("100"),args = {1,2,3})
class Student{
}

@MyAnno03
class Teacher{
	//@MyAnno03
	String name;
	@MyAnno03
	private void show() {

	}
}

public class MyAnnoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
