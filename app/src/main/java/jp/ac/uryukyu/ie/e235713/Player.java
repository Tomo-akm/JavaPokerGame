package jp.ac.uryukyu.ie.e235713;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int score;
    private boolean status;
    private int currentBet;

    public Player(String _name) {
        this.name = _name;
        this.score = 10000;
        this.hand = new ArrayList<Card>();
        this.status = true;
    }

    // 手札にカードを追加するメソッド、手札の評価を行うメソッドなど

    public String getName() {
        return this.name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setHand(Card card){
        hand.add(new Card(card.getSuit(), card.getRank()));
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
 
    public void setScore(int _score) {
        this.score = _score;
    }

    public int getScore() {
        return this.score;
    }

    public void showScore() {
        System.out.println(name + "'s current score is :" + this.score);
    }

    public void setCurrentBet(int bet) {
        this.currentBet = bet;
    }

    public int getCurrentBet() {
        return this.currentBet;
    }    

    public void showHand() {
        System.out.println("Your hand is :");
        for (Card card : this.hand) {
            System.out.println(card.getSuit() + " " +card.getRank());
        }
    }
}