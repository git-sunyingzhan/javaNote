package se01.day01.string_test;

import java.util.Arrays;

/*
 * 在大字符串中查找小字符串出现的次数
 * "woaijavawoaixuexiwoaishenghuowoaizuguoaidangairenmin"
 * 'ai'
 */
public class Test02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String bString = "woaiaijavawoaixuexiwoaishenghuowoaizuguoaidangairenmin";
        String sString = "ai";
        int counts = getCount(bString,sString);
        System.out.println(counts);
    }

	private static int getCount(String bString, String sString) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < bString.length()-sString.length(); i++) {
			if (bString.substring(i, i+sString.length()).equals(sString)) {
				count += 1;
				i += 1;
			}
		}
		
		return count;
	}

}
