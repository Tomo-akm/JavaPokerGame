package jp.ac.uryukyu.ie.e235713;

/**
 * カードを用意するクラス。
 */
public class Card {
    /**
     * カードのスート（ハート、ダイヤ、クラブ、スペード）
     */
    private String suit;
    /**
     * カードのランク（A、2、3、...、J、Q、K）
     */
    private String rank;

    /**
     * コンストラクタ
     * 
     * @param suit
     * @param rank
     */
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * このカードのスートを返します。
     * @return スートを表す文字列
     */
    public String getSuit() {
        return this.suit;
    }

    /**
     * このカードのランクを返します。
     * @return ランクを表す文字列
     */
    public String getRank() {
        return this.rank;
    }

}