package se02.day05.fightLandlords;

public class Server {

	public static void main(String[] args) {
		Poker p = new Poker("♠️","A",1);
		Poker p2 = new Poker("♠️","2",1);
		System.out.println(p2.compareTo(p));

	}

}
