package se01.day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * 定义一个ArrayList集合，存入多个字符串。删除长度大于5的字符串，打印删除后的集合
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList aList = new ArrayList();
		aList.add("fsaf");
		aList.add("dshv");
		aList.add("vsdjkbvjds");
		aList.add("fas");
		aList.add("vhdsuvd");
		
		//删除长度大于5的字符串
		delStr(3,aList);
		
		System.out.println(aList);
	}

	private static void delStr(int length, ArrayList aList) {
		// TODO Auto-generated method stub
		ListIterator lt = aList.listIterator();
		String s = null;
		while(lt.hasNext()) {
			s = (String) lt.next();
			if(s.length()>length) {
				lt.remove();//删除当前获取的元素
			}
		}
	}

}
