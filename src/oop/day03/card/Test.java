package oop.day03.card;

import java.util.Arrays;
import java.util.Random;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        // 牌盒
        Card[] cards = new Card[Card.SIZE];
        int index = 0;// 牌盒下标
        // 生成3～2的52张牌
        for (int rank = Card.THREE; rank <= Card.TWO; rank++) {
            cards[index++] = new Card(Card.SPADE, rank);
            cards[index++] = new Card(Card.HEART, rank);
            cards[index++] = new Card(Card.CLUBS, rank);
            cards[index++] = new Card(Card.DINMOND, rank);
        }
        // 小王
        cards[index++] = new Card(Card.KING, Card.LITTLE_KING);
        // 大王
        cards[index++] = new Card(Card.KING, Card.BIG_KING);
        System.out.println(Arrays.toString(cards));

        // 洗牌
        Random r = new Random();
        int j = 0;
        for (int i = 0; i < cards.length; i++) {
            j = r.nextInt(cards.length);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
        System.out.println(Arrays.toString(cards));

        // 创建三个玩家
        Player[] players = new Player[3];
        players[0] = new Player(1, "悟空");
        players[1] = new Player(2, "悟净");
        players[2] = new Player(3, "悟能");

        // 发牌
        Card card = null;
        for (int k = 0; k < cards.length; k++) {
            card = cards[k];
            players[k % players.length].add(card);
        }

        // 排序
        players[0].sort();
        players[1].sort();
        players[2].sort();

        // 看牌
        System.out.println(players[0]);
        System.out.println(players[1]);
        System.out.println(players[2]);
    }
}