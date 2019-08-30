package se01.day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class PokerDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//牌盒	K：牌标号  V：牌
		Map<Integer, String> map = new HashMap<Integer, String>();
		//牌标号集合
		List<Integer> list = new ArrayList<Integer>();
		
		String[] suits = {"♦️","♣️","♥️","♠️"};
		String[] ranks = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		
		//将牌放入牌盒中
		for (int j = 0; j < ranks.length; j++) {
			for (int k = 0; k < suits.length; k++) {
				map.put(j*10+k, suits[k]+ranks[j]);
				list.add(j*10+k);
			}
		}
		
		//放入大小王
		map.put(134, "小王");
		list.add(134);
		map.put(145, "大王");
		list.add(145);		
		
		//洗牌（牌的标号）
		Collections.shuffle(list);

		//玩家牌盒
		TreeSet<Integer> player01 = new TreeSet<Integer>();
		TreeSet<Integer> player02 = new TreeSet<Integer>();
		TreeSet<Integer> player03 = new TreeSet<Integer>();
		TreeSet<Integer> diPai = new TreeSet<Integer>();
		
		//发牌
		for (int j = 0; j < list.size(); j++) {
			if(j>=list.size()-3) {
				diPai.add(list.get(j));
			}else if (j%3==0) {
				player01.add(list.get(j));
			}else if (j%3==1) {
				player02.add(list.get(j));
			}else {
				player03.add(list.get(j));
			}
		}
		
		//看牌
		lookPoker("悟空",player01,map);
		lookPoker("悟净",player02,map);
		lookPoker("悟能",player03,map);
		lookPoker("底牌",diPai,map);
		
	}

	private static void lookPoker(String string, TreeSet<Integer> player, Map<Integer, String> map) {
		// TODO Auto-generated method stub
		System.out.print(string+": ");
		for (Integer i : player) {
			String poker = map.get(i);
			System.out.print(poker+" ");
		}
		System.out.println();
	}

}
