package se01.day02.regex;

import java.util.Arrays;

/*
 * 
 */
public class RegexDemo02 {
	public static void main(String[] args) {
		String ageInfo = "18~22";
		//分割
		String[] ages = ageInfo.split("~");
		System.out.println(Arrays.toString(ages));
		
		int age_min = Integer.parseInt(ages[0]);//String转int
		int age_max = Integer.parseInt(ages[1]);
		System.out.println(age_min+"-----"+age_max);
	}
}
