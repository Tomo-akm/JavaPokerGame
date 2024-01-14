import jp.ac.uryukyu.ie.e235713.*;

public class Main {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String playerScorePath = currentDir + "/src/main/resources/playerScore.txt";
        String botScorePath = currentDir + "/src/main/resources/botScore.txt";

        Player player1 = new Player("Player",playerScorePath);
        Bot bot1 = new Bot("Bot", botScorePath);

        GameController gameController = new GameController(player1, bot1);

        gameController.startGame();
    }

}
