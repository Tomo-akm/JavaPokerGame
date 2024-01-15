import jp.ac.uryukyu.ie.e235713.*;

public class Main {
    public static void main(String[] args) {
        String currentDir = System.getProperty("user.dir");
        String playerScorePath;
        String botScorePath;
        
        // アプリケーションがJARファイルとして実行されているかどうかを判断
        if (Main.class.getResource("Main.class").toString().startsWith("jar:")) {
            playerScorePath = currentDir + "/app/src/main/resources/playerScore.txt";
            botScorePath = currentDir + "/app/src/main/resources/botScore.txt";
        } else {
            playerScorePath = currentDir + "/src/main/resources/playerScore.txt";
            botScorePath = currentDir + "/src/main/resources/botScore.txt";
        }

        Player player1 = new Player("Player",playerScorePath);
        Bot bot1 = new Bot("Bot", botScorePath);

        GameController gameController = new GameController(player1, bot1);
        gameController.startGame();
    }

}
