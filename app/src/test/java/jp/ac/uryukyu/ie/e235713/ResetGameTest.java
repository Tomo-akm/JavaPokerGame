package jp.ac.uryukyu.ie.e235713;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

/**
 * ゲームのリセット機能をテストするクラス。
 */
class ResetGameTest {
    /**
     * ゲームのリセットが正しく機能することを確認するメソッド。
     * プレイヤーの手札が正しく空になることを確認します。
     */    
    @Test
    void resetGameTest () {
        Deck testDeck = new Deck();
        Player player1 = new Player("Player");
        Bot bot1 = new Bot("Bot");

        GameController gameController1 = new GameController(player1, bot1);
        GameController gameController2 = new GameController(player1, bot1);
        GameController gameController3 = new GameController(player1,bot1);
        
        ArrayList<GameController> gameList = new ArrayList<GameController>();

        gameList.add(gameController1);
        gameList.add(gameController2);
        gameList.add(gameController3);

        testDeck.shuffle();

        for (GameController g : gameList) {
            player1.setHand(testDeck.deal());
            player1.setHand(testDeck.deal());

            g.resetGame();

            assertEquals(true, player1.getHand().isEmpty());
        }
    }    
}
