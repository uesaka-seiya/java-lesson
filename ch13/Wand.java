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
 * （ただしHPに負の値をセットした場合は自動的に0が設定される）
 */
public class Wand {

    /**
     * 杖の名前
     */
    private String name;

    /**
     * 杖の魔力
     */
    private double power;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("杖の名前は3文字以上で設定してください");
        }
        this.name = name;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        if (power < 0.5 || power > 100) {
            throw new IllegalArgumentException("杖の魔力は0.5以上100以下で設定してください");
        }
        this.power = power;
    }
}
