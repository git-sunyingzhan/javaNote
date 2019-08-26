package se01.day01.string_test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

//编码和解码
public class StringDemo07 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String s = "Java小虫子";
		//以默认字符集编码
		byte[] bys = s.getBytes();
		//[74, 97, 118, 97, -27, -80, -113, -24, -103, -85, -27, -83, -112]
		System.out.println(Arrays.toString(bys));
		//以GBK进行编码
		byte[] bys1 = s.getBytes("GBK");
		//[74, 97, 118, 97, -48, -95, -77, -26, -41, -45]
		System.out.println(Arrays.toString(bys1));
		
		//以默认字符集进行解码
		String s1 = new String(bys);
		System.out.println(s1);
		
		//以GBK进行解码
		String s2 = new String(bys1,"gbk");
		System.out.println(s2);
		//注意：在进行编码和解码的时候，一定要保持一致，不然会出现乱码
	}

}
