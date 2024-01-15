package jp.ac.uryukyu.ie.e235713;

public class Bot extends Player{
    
    public Bot(String name) {
        super(name);
    }

    @Override
    public String getPath() {
        String currentDir = System.getProperty("user.dir");
        String botScorePath;
       // アプリケーションがJARファイルとして実行されているかどうかを判断
       if (Bot.class.getResource("Bot.class").toString().startsWith("jar:")) {
        botScorePath = currentDir + "/app/src/main/resources/botScore.txt";
    } else {
        botScorePath = currentDir + "/src/main/resources/botScore.txt";
    }
        return botScorePath;
    }
}
