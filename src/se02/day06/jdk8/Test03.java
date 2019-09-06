package se02.day06.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
 * 将数组中满足条件的元素放入到List集合中
 * 1）女
 * 2）名字长度为4
 * 遍历集合，获取所有满足条件的姓名
 */
public class Test03 {

	public static void main(String[] args) {
		String[] arr = {"迪丽热巴，女","古力娜扎，女","成吉思汗，男","赵丽颖，女"};
		List<String> list = getList(one->one.split("，")[1].equals("女"),two->two.split("，")[0].length()==4,arr);
		for (String string : list) {
			System.out.println(string);
		}
		
	}

	public static List<String> getList(Predicate<String> one,
								Predicate<String> two,String[] arr){
		List<String> list = new ArrayList<>();
		for (String s : arr) {
			if(one.and(two).test(s)) {
				list.add(s.split(",")[0]);
			}
		}
		return list;
	}
	
}
