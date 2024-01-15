package jp.ac.uryukyu.ie.e235713;

import java.util.Scanner;

public class GameController {
    private Game game;
    private Player player1;
    private Bot bot1;

    public GameController(Player player, Bot bot) {
        this.player1 = player;
        this.bot1 = bot;
        this.game = new Game(player1, bot1, this);
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
            if (i < 3) {
                game.showCommunityCard();
            } else {
                System.out.println("--------------------------------");
                System.out.println("Showdown:\n");
            }
        }

        System.out.println("Player's hand is :" + HandEvaluator.evaluateHand(player1, game));
        System.out.println("Bot's hand is :" + HandEvaluator.evaluateHand(bot1, game) + "\n");
        System.out.println(game.determineWinner() + "\n");
        player1.showScore();
        bot1.showScore();
        player1.saveScore();
        bot1.saveScore();

        continueAction();
    }

    public void resetGame() {
        player1.resetData();
        bot1.resetData();
        game = new Game(player1, bot1, this);

    }

    public void continueAction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONTINUE?\n1. Continue\n2. Exit from the game\n");
        int action = scanner.nextInt();

        if (action == 1) {
            System.out.println("Continue! Let's go next game!\n----------------------------------------------------------------\n");
            resetGame();
            startGame();
        }else if (action == 2) {
            System.out.println("Game Over! Thank you for playing.");
            System.exit(0);  // ゲームを終了
        }else {
            System.err.println("Invalid action. Choose a number between 1 or 2.\n");
            continueAction();
        }

    }

}
