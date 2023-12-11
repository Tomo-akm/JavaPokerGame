import jp.ac.uryukyu.ie.e235713.*;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Hoge");
        Bot bot1 = new Bot("Bot");
        Game game = new Game(player1, bot1);


        game.addHand(player1);
        player1.showHand();
        game.addHand(bot1);
        bot1.showHand();
        game.frop();
        game.showCommunityCard();
        
    }
}
