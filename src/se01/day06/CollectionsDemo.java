package se01.day06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("c","d","a","b");
		
		//自然排序
		Collections.sort(list);
		
		System.out.println(list);
		
		//比较器排序
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		
		System.out.println(list);
		//二分法查找
		int index = Collections.binarySearch(list, "c");
		System.out.println(index);
		
		//最大值
		System.out.println(Collections.max(list));
		
		//反转
		Collections.reverse(list);
		System.out.println(list);
		
		//随机置换
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
