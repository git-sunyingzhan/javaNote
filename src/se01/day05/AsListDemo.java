package se01.day05;

import java.util.Arrays;
import java.util.List;

public class AsListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Tom","Tony","Jerry");
		//UnsupportedOperationException	不支持该操作
		//list.remove("Tony");
		list.set(0, "YuMi");
		System.out.println(list);
	}

}
