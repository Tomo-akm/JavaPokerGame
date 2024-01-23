# JavaPokerGame
## Overview
「**ホールデムポーカー**」をJavaで構築してみようとした。  
　仕様としては、対NPC（Bot）で手札２枚、場に５枚のカードがあり、合計７枚のカードから５枚のカードで役を作り、持っているスコアを賭けて勝負するポーカーである。  
　また、完璧に実装するまではできず、レイズやオールインなどのアクションに関しては実装されてない。今回は、CUI上で入力してアクションをすることができる。

## Install & Run
1. Download installation materials.
    ```bash
    git clone https://github.com/Tomo-akm/JavaPokerGame.git 
    cd JavaPokerGame
    ```
2. Run 
- Using gradle
    ```bash
    gradle --console plain run
    ```
- Using the jar file
    ```bash
    gradle jar
    java -jar app/build/libs/app.jar
    ```