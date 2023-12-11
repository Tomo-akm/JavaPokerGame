package jp.ac.uryukyu.ie.e235713;

import java.util.ArrayList;

public class Game {
    private Deck deck;
    private ArrayList<Card> communityCard;
    private int pot;

    public Game(Player _player, Bot _bot) {
        this.deck = new Deck();
        this.communityCard = new ArrayList<Card>();

        deck.shuffle(); //ゲームを立てたらカードをシャッフルする。
    }

    // ゲームの開始、カードの配布、手札の評価、勝者の決定などのメソッド
    public void addHand(Player player) {
        player.setHand(deck.deal());
        player.setHand(deck.deal());
    }

    public void showCommunityCard() {
        System.out.println("Now Community card is ");
        for (Card card : communityCard) {
            System.out.println(card.getSuit() + " " + card.getRank());
        }
    }

    public void frop() {
        for (int i=0; i<3; i++) {
            deck.deal();
            communityCard.add(new Card(deck.deal().getSuit(),deck.deal().getRank()));
        }
    }

    public int remainCard() {
        int count = 0;
        for (Card card : deck.getCards()) {
            count += 1;
        }
        return count;
    }
} 
