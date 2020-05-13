package ch11;

/**
 * p453 練習11-1
 * TangibleAssetを親クラスとする子クラスComputer
 */
public class Computer extends TangibleAsset {
    String makerName;

    public Computer(String name, int price, String color, String makerName) {
        super(name, price, color);
        this.makerName = makerName;
    }

    public String getMakerName() {
        return this.makerName;
    }
}
