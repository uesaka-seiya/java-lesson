package ch11;

/**
 * p453 練習11-1
 * 様々な形ある資産を管理する際に有用な「TangibleAsset(有形資産)」という抽象クラスを作成
 * TangibleAssetを継承する Book と Computer を作成
 */
public abstract class TangibleAsset {
    String name;
    int price;
    String color;

    public TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }
}
