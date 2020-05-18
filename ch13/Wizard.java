package ch13;

/**
 * p518 練習13-1
 * 2つのクラスWizard（魔法使い）とWand（杖）に宣言されているすべてのフィールドとメソッドについて、アクセス修飾子を追加せよ。
 * このとき13.2.4項に記載のカプセル化の定石（下記）に従うこと。
 * - フィールドはすべてprivate
 * - メソッドはすべてpublic
 * p519 練習13-3
 * エラーを解決するようgetterメソッドとsetterメソッドを追加せよ
 * p519 練習13-4
 * 先に作成したWizardクラスとWandクラスのsetterメソッドについて、
 * 下記の4つのルールに従って引数の妥当性検証を追加せよ。
 * 引数が妥当でない時は「throw new IllegalArgument Exception」を用いて
 * 何らかのエラーメッセージを表示し、プログラムを中断せよ。
 * - 魔法使いや杖の名前は3文字以上を指定する
 * - 杖による増幅率（杖の魔力）は0.5以上100以下である
 * - 魔法使いは必ず杖を装備する
 * - 魔法使いのHPとMPは0以上である
 *  （ただしHPに負の値をセットした場合は自動的に0が設定される）
 */
public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10; // 基本回復ポイント
        int recoveredPoint = (int) (basePoint * this.getWand().getPower());   //杖による増幅
        h.setHp(h.getHp() + recoveredPoint);    //勇者のHPを回復する
        System.out.println(h.getName() + "のHPを" + recoveredPoint + "回復した！");
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MPは0以上で設定してください");
        }
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("魔法使いの名前は3文字以上で設定してください");
        }
        this.name = name;
    }

    public Wand getWand() {
        return this.wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("装備する杖を指定してください");
        }
        this.wand = wand;
    }
}
