package ch13;

/**
 * p518 練習13-1
 * 2つのクラスWizard（魔法使い）とWand（杖）に宣言されているすべてのフィールドとメソッドについて、アクセス修飾子を追加せよ。
 * このとき13.2.4項に記載のカプセル化の定石（下記）に従うこと。
 * - フィールドはすべてprivate
 * - メソッドはすべてpublic
 * p519 練習13-3
 * エラーを解決するようgetterメソッドとsetterメソッドを追加せよ
 */
public class Wand {
    private String name;    // 杖の名前
    private double power;   //杖の魔力

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return this.power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
