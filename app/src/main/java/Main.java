import jp.ac.uryukyu.ie.e235713.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player");
        Bot bot1 = new Bot("Bot");

        GameController gameController = new GameController(player1, bot1);
        gameController.startGame();
    }

}
