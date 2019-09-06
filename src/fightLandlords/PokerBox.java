package fightLandlords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/*
 * 牌盒
 */
public class PokerBox implements RandomAccess {
	private String[] suits = { "♠️", "♥️", "♣️", "♦️" };
	private String[] ranks = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2" };
	private String bigKing = "大王";
	private String littleKing = "小王";

	public PokerBox() {
	}

	// 获取所有牌
	public List<Poker> getPokers() {
		List<Poker> pokers = new ArrayList<Poker>();
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				pokers.add(new Poker(suits[j],ranks[i],i*10+j));
			}
		}
		pokers.add(new Poker("",littleKing,130));
		pokers.add(new Poker("",bigKing,140));
		return pokers;
	}
	
	//获取打乱的牌
	public List<Poker> getRandomPokers(){
		List<Poker> pokers = getPokers();
		Collections.shuffle(pokers);
		Collections.shuffle(pokers);
		return pokers;
	}
	
}