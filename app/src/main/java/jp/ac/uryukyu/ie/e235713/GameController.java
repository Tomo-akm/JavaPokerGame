package jp.ac.uryukyu.ie.e235713;

public class GameController {
    private Game game;
    private Player player1;
    private Bot bot1;

    public GameController() {
        this.player1 = new Player("Player", "src/main/resources/playerScore.txt");
        this.bot1 = new Bot("Bot", "src/main/resources/botScore.txt");
        this.game = new Game(player1, bot1);
    }

    public void startGame() {
        game.addHand(player1);
        game.addHand(bot1);

        for (int i = 0; i < 4; i++) {
            player1.showHand();
            game.playerAction();
            game.checkWinner();
            game.botAction();
            game.checkWinner();

            if (i == 0) {
                game.frop();
            } else {
                game.turnAndRiver();
            }

            game.showCommunityCard();
        }

        System.out.println("Player's hand is :" + HandEvaluator.evaluateHand(player1, game));
        System.out.println("Bot's hand is :" + HandEvaluator.evaluateHand(bot1, game) + "\n");
        System.out.println(game.determineWinner() + "\n");
        player1.showScore();
        bot1.showScore();
        player1.saveScore("src/main/resources/playerScore.txt");
        bot1.saveScore("src/main/resources/botScore.txt");

    }

}
