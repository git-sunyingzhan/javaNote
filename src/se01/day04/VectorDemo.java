package se01.day04;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		//添加元素
		v.addElement("hello");
		v.addElement("world");
		v.addElement("java");
		System.out.println(v);
		
		//获取第二个元素
		System.out.println(v.elementAt(1));
		
		//获取所有元素组成的枚举对象
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
