package ch08;

/**
 * p329 練習8-1
 * 聖職者「クレリック」を表現するクラスClericをpublicで宣言。
 * p329 練習8-2
 * 「名前」「HP」「最大HP」「MP」「最大MP」を属性として追加。
 * HPと最大HPの初期値は50(整数), MPと最大MPの初期値は10(整数)。
 * 最大HPと最大MPは定数フィールドで宣言。
 * p329 練習8-3
 * selfAid()を追加。引数なし、戻り値なし。
 * MPを5消費することで自分自身のHPを最大HPまで回復するメソッド。
 */
public class Cleric {
    String name;
    int hp;
    final int MAX_HP = 50;
    int mp;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "は、セルフエイドを唱えた！");
        this.hp = this.MAX_HP;
        this.mp -= 5;
        System.out.println("HPが最大まで回復した");
        System.out.println("MPは"+ this.mp + "になった");
    }


}
