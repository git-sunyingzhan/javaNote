package se01.day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		System.out.println(map.put("four", 4));
		//如果在添加键值对到时候，键有重复，后面添加到值会覆盖前面到值
		System.out.println(map.put("two", 22));
		
		//清空
		//map.clear();
		
		//删除
		map.remove("two");
		
		//是否包含指定键
		System.out.println(map.containsKey("two"));
		
		//是否包含指定值
		System.out.println(map.containsValue(1));
		
		//是否为空
		System.out.println(map.isEmpty());
		
		//获取集合大小
		System.out.println(map.size());
		
		//通过键获取值
		System.out.println(map.get("three"));
		
		//获取所有键组成到集合
		System.out.println(map.keySet());
		
		//获取所有值组成到集合
		System.out.println(map.values());
		
		//获取所有键值对组成到集合
		Set<Entry<String,Integer>> kvs = map.entrySet();
		System.out.println(map.entrySet());
		
		System.out.println(map);
	}

}
