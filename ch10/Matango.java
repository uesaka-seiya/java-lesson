package ch10;

/**
 * p404 練習10-3 動作確認用プログラム Matango.java
 * ひたすら攻撃するお化け毒キノコの親クラスです。
 */
public class Matango {
    int hp = 50;
    char suffix;

    public  Matango(char suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero h) {
        System.out.println("キノコ" + this.suffix + "の攻撃");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }
}
