package oop.day03.card;

import java.util.Arrays;

/**
 * Player
 */
public class Player {
    private int id;
    private String name;
    private Card[] cards;// 玩家手上的牌

    public Player() {

    }

    public Player(int id, String string) {
        this.id = id;
        this.name = string;
        this.cards = new Card[] {};
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // 摸牌
    public void add(Card card) {
        cards = Arrays.copyOf(cards, cards.length + 1);
        cards[cards.length - 1] = card;
    }

    // 排序
    public void sort() {
        for (int i = 0; i < cards.length - 1; i++) {
            for (int j = 0; j < cards.length - 1; j++) {
                if (cards[j].getRank() > cards[j + 1].getRank()) {
                    Card temp = cards[j];
                    cards[j] = cards[j + 1];
                    cards[j + 1] = temp;
                }
            }
        }
    }

    public java.lang.String toString() {
        return name + "---" + Arrays.toString(cards);
    }

}