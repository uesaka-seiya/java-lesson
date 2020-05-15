package ch13;

/**
 * p518 練習13-1
 * 2つのクラスWizard（魔法使い）とWand（杖）に宣言されているすべてのフィールドとメソッドについて、アクセス修飾子を追加せよ。
 * このとき13.2.4項に記載のカプセル化の定石（下記）に従うこと。
 * - フィールドはすべてprivate
 * - メソッドはすべてpublic
 */
public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10; // 基本回復ポイント
        int recoveredPoint = (int) (basePoint * this.wand.power);   //杖による増幅
        h.setHp(h.getHp() + recoveredPoint);    //勇者のHPを回復する
        System.out.println(h.getName() + "のHPを" + recoveredPoint + "回復した！");
    }
}
