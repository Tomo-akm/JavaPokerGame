import jp.ac.uryukyu.ie.e235713.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player", "src/main/resources/playerScore.txt");
        Bot bot1 = new Bot("Bot", "src/main/resources/botScore.txt");

        GameController gameController = new GameController(player1, bot1);

        gameController.startGame();
    }

}
