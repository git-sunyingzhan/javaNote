package se02.day06.annotation;

/*
 * 属性返回值类型
 */
public @interface MyAnno01 {
	int age();
	String name();
	MyMath mm();
	MyAnno02 ma2();
	
	int[] args();
	
}
