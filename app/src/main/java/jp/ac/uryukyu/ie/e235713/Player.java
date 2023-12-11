package jp.ac.uryukyu.ie.e235713;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private String handRank;
    private int score;

    public Player(String _name) {
        this.name = _name;
        this.score = 10000;
        this.hand = new ArrayList<Card>();
    }

    // 手札にカードを追加するメソッド、手札の評価を行うメソッドなど
    public void displayHand() {
        System.out.println(name + "'s hand");
        for(Card card : hand){
            System.out.println(card.getSuit() + " " + card.getRank());
        }
    }

    public void setHand(Card card){
        hand.add(new Card(card.getSuit(), card.getRank()));
    }

    public void setScore(int _score) {
        this.score = _score;
    }

    public int getScore() {
        return this.score;
    }

    public void addPot(){
        
    }

    public void showHand() {
        System.out.println("Your hand is :");
        for (Card card : this.hand) {
            System.out.println(card.getSuit() + " " +card.getRank());
        }
    }
}