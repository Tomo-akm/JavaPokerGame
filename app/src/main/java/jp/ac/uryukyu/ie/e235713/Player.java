package jp.ac.uryukyu.ie.e235713;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int score;
    private boolean status;
    private int currentBet;

    public Player(String _name, String fileName) {
        this.name = _name;
        this.hand = new ArrayList<Card>();
        this.status = true;

        loadScore(fileName);
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

    // スコアをファイルから読み込むメソッド
    public void loadScore(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
                saveScore(filename);
            } catch (IOException e) {
                System.out.println("Error creating new file: " + e.getMessage());
            }
        }

        try (Scanner scanner = new Scanner(file)) {
            if (scanner.hasNextInt()) {
                // scoreが0の時、10000にリセットする。
                this.score = scanner.nextInt();
                if (this.score == 0) {
                    this.score = 10000;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Unexpected error: Score file not found after creation: " + e.getMessage());
        }
        saveScore(filename);
    }

    // スコアをファイルに書き込むメソッド
    public void saveScore(String filename) {
        try {
            // ファイルの現在の内容を読み込む
            List<String> lines = new ArrayList<>(Files.readAllLines(Paths.get(filename)));

            // 1行目を上書きする（スコアで）
            if (!lines.isEmpty()) {
                lines.set(0, String.valueOf(this.score));
            } else {
                lines.add(String.valueOf(this.score));
            }

            // 内容を再度ファイルに書き込む
            Files.write(Paths.get(filename), lines);
        } catch (IOException e) {

            System.out.println("Unable to save score: " + e.getMessage());
        }
    }
    
    public void showScore() {
        System.out.println(name + "'s current score is :" + this.score + "\n");
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
        System.out.println();
    }

    public void resetData() {
        setStatus(true);
        this.hand = new ArrayList<Card>();
    }
}