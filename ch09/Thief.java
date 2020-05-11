package ch09;

/**
 * p364 練習9-1
 * Thiefクラスについて以下の要件を満たすコンストラクタを定義せよ。
 * ・名前・HP・MPを指定してインスタンス化できる。
 * ・名前とHPだけを指定してインスタンス化できる。MPの初期値は5。
 * ・名前だけを指定してインスタンス化できる。HPは40、MPは5で初期化される。
 * ・名前を指定しない場合はインスタンス化できない。
 * ・コンストラクタは極力重複コードをなくすように記述する。
 */
public class Thief {
    String name;
    int hp;
    int mp;

    public Thief(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public Thief(String name, int hp) {
        this(name, hp, 5);
    }

    public Thief(String name) {
        this(name, 40);
    }
}
