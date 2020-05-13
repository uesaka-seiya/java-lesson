package ch11;

/**
 * p453 練習11-1
 * 様々な形ある資産を管理する際に有用な「TangibleAsset(有形資産)」という抽象クラスを作成
 * TangibleAssetを継承する Book と Computer を作成
 * p454 練習11-2
 * 抽象クラスAssetを作成後これを継承するようにTangibleAssetを修正
 * (差分はコミットからご確認ください)
 */
public abstract class TangibleAsset extends Asset {
    String color;

    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
