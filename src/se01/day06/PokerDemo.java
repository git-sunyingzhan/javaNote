package se01.day06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 三人斗地主，洗牌，发牌，看牌
 */

public class PokerDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//牌盒
		List<String> list = new ArrayList<String>();
		String[] suits = {"♠️","♥️","♣️","♦️"};
		String[] ranks = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		
		//装牌
		for (String suit : suits) {
			for (String rank : ranks) {
				list.add(suit.concat(rank));
			}
		}
		list.add("小王");
		list.add("大王");
		
		//洗牌
		Collections.shuffle(list);
		
		//玩家牌盒
		List<String> player01 = new ArrayList<String>();
		List<String> player02 = new ArrayList<String>();
		List<String> player03 = new ArrayList<String>();
		List<String> dipai = new ArrayList<String>();
		
		//发牌
		for (int i = 0; i < list.size(); i++) {
			String poker = list.get(i);
			//最后三张给底牌
			if(i>=list.size()-3) {
				dipai.add(poker);
			}else if(i%3==0) {
				player01.add(poker);
			}else if(i%3==1) {
				player02.add(poker);
			}else {
				player03.add(poker);
			}
		}
		
		//排序
		Collections.sort(player01);
		Collections.sort(player02);
		Collections.sort(player03);
		
		//看牌
		System.out.println(player01);
		System.out.println(player02);
		System.out.println(player03);
		System.out.println(dipai);
	}

}
