package ch10;

/**
 * p404 練習10-3 レビュー対象プログラム PoisonMatango.java
 * 問題: 親クラス Matango.java を利用し、仕様に則った子クラスを作成せよ。
 */
public class PoisonMatango extends Matango {
    int poisonCount = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonCount > 0) {
            System.out.println("HP: " + h.hp);
            System.out.println("「さらに毒の胞子をばらまいた！」");
            int damage = h.hp / 5;
            h.hp -= damage;
            System.out.println(damage + "ポイントのダメージ");
            this.poisonCount --;
        }
    }
}
