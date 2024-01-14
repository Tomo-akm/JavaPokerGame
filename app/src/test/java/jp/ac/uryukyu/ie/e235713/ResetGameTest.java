package jp.ac.uryukyu.ie.e235713;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class ResetGameTest {
    @Test
    void resetGameTest () {
        Deck testDeck = new Deck();
        Player player1 = new Player("Player", "src/test/resources/playerScoreTest.txt");
        Bot bot1 = new Bot("Bot", "src/test/resources/botScoreTest.txt");

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
