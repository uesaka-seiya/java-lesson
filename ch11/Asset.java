package ch11;

/**
 * p454 練習11-2
 * 抽象クラスAsset(資産)を問題の前提に沿って作成
 * このクラスを継承するようにTangibleAssetを修正
 */
public abstract class Asset {
    String name;
    int price;

    public Asset(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
