package ch10;

/**
 * p404 練習10-3 動作確認用プログラム Main.java
 * 動作確認では、ひたすらお化け毒キノコから攻撃を受けます。
 * 毒の胞子をばらまくことができるのは5回までです。
 */
public class Main {
    public static void main(String[] args) {
        Hero player1 = new Hero("ミナト", 200);
        PoisonMatango enemyA = new PoisonMatango('A');
        while (player1.hp > 0) {
            System.out.println("HP: " + player1.hp);
            enemyA.attack(player1);
        }
        System.out.println("【GAME OVER】HPは 0ですが ぼうけんのしょは 未実装です。");
    }
}
