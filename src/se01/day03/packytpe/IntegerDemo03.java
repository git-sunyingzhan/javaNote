package se01.day03.packytpe;

/*
 * Integer变量的值如果直接赋值（实际是通过valueOf）。如果值在-128～127之间，
 * 会先创建一个缓冲区，如果值在缓冲区里面存在，直接使用缓冲区里面的值。如果在缓冲区里面不存在，就在缓冲区里面创建。
 */
public class IntegerDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1==i2);//f
		System.out.println(i1.equals(i2));//t
		
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i3==i4);
		System.out.println(i3.equals(i4));
		
		
		
		Integer i5 = new Integer(128);
		Integer i6 = new Integer(128);
		System.out.println(i5==i6);//f
		System.out.println(i5.equals(i6));//t
		
		Integer i7 = 128;
		Integer i8 = 128;
		System.out.println(i7==i8);
		System.out.println(i7.equals(i8));
	}

}
