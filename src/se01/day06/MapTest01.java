package se01.day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 创建一个Map集合，遍历Map集合，输出所有键值对信息
 */
public class MapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<String, String>();
		map.put("001", "张三");
		map.put("002", "李四");
		map.put("003", "王五");
		
		show1(map);
		
		System.out.println("---------");
		
		show2(map);
		
	}

	private static void show2(Map<String, String> map) {
		// TODO Auto-generated method stub
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	private static void show1(Map<String, String> map) {
		// TODO Auto-generated method stub
		for (String s : map.keySet()) {
			System.out.println("key="+s+",value="+map.get(s));
		}
		
	}

}
