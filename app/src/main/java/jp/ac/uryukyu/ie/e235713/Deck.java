package jp.ac.uryukyu.ie.e235713;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

        // 52枚のカードを生成してデッキに追加する
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card deal() {
        return this.cards.remove(this.cards.size() - 1); 
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }
}
