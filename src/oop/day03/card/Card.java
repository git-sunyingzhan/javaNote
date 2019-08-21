package oop.day03.card;

/**
 * Card
 */
public class Card {

    public static final int SIZE = 54;// 一副牌有54张

    // 花色常量
    public static final int SPADE = 0;// 黑桃
    public static final int HEART = 1;// 红桃
    public static final int CLUBS = 2;// 梅花
    public static final int DINMOND = 3;// 方片
    public static final int KING = 4;// 王
    // 点数常量
    public static final int THREE = 0;
    public static final int FOUR = 1;
    public static final int FIVE = 2;
    public static final int SIX = 3;
    public static final int SEVEN = 4;
    public static final int EIGHT = 5;
    public static final int NINE = 6;
    public static final int TNE = 7;
    public static final int ELEVEN = 8;
    public static final int TWELVE = 9;
    public static final int THIRTEEN = 10;
    public static final int ONE = 11;
    public static final int TWO = 12;

    // 大小王
    public static final int LITTLE_KING = 13;
    public static final int BIG_KING = 14;

    // 花色suit 点数rank
    private int suit;
    private int rank;

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Card() {
        super();
    }

    public Card(int suit, int rank) {
        super();
        this.suit = suit;
        this.rank = rank;
    }

    private static final String[] SUITS = { "♠️", "♥️", "♦️", "♣️", "" };
    private static final String[] RANKS = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "小王",
            "大王" };

    // new Card(1,3)
    public String toString(int suit, int rank) {
        return SUITS[suit] + RANKS[rank];
    }

}