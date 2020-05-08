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
 * p329 練習8-4
 * MP回復のメソッドpray()を追加。
 * 回復量は祈った秒数にランダムで0〜2ポイントの補正を加えた値。
 * ただし最大HPを超過することはない。
 * 引数に祈る秒数を指定し戻り値として「実際に回復したMPの量」を返す。ｑ
 */
public class Cleric {
    String name;
    int hp;
    final int MAX_HP = 50;
    int mp;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "は セルフエイドを となえた！");
        if (this.mp >= 5) {
            this.hp = this.MAX_HP;
            this.mp -= 5;
            System.out.println("HPが さいだいまで かいふくした");
        } else {
            System.out.println("しかし MPが たりない！");
        }
    }

    public int pray(int sec) {
        System.out.println(this.name + "は " + sec + "秒間 祈った！");
        int recover = new java.util.Random().nextInt(3) + sec;
        int recoverActual = Math.min(recover, this.MAX_MP - this.mp);
        this.mp = this.mp + recoverActual;
        System.out.println("MPが " + recoverActual + " かいふくした！");
        return recoverActual;
    }
}
