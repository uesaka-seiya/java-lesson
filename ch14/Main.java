package ch14;

/**
 * 第14章 練習問題 動作確認用メインクラス
 */
public class Main {
    public static void main(String[] args) {
        // 練習14-1 ① 動作確認
        Account a = new Account("4649");
        a.setBalance(1592);
        System.out.println(a);

        // 練習14-1 ② 動作確認
        Account b = new Account("4649 ");
        b.setBalance(2000);
        if (a.equals(b)) {
            System.out.println("口座番号は同じです");
        } else {
            System.out.println("口座番号は異なります");
        }

        // 練習14-2 動作確認
        Cleric player = new Cleric("ミナト");
        player.setHp(10);
        System.out.println(player);
        player.selfAid();
        System.out.println(player);
        player.pray(4);
        System.out.println(player);
    }
}
