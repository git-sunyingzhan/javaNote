package se01.day06;

import java.util.HashMap;
import java.util.Map;

/*
 * 统计指定字符串中每组数字出现的次数
 */
public class MapTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123,asd543,*&345,ab123,234,345,543,123";
		String[] ss = s.split("\\D+");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (String string : ss) {
			if(map.containsKey(string)) {
				map.put(string, map.get(string)+1);
			}else {
				map.put(string, 1);
			}
		}
		
		System.out.println(map);
		
	}

}
