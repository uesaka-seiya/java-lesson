package ch11;

/**
 * p453 練習11-1
 * 様々な形ある資産を管理する際に有用な「TangibleAsset(有形資産)」という抽象クラスを作成
 * TangibleAssetを継承する Book と Computer を作成
 * (以下差分はコミットからご確認ください)
 * p454 練習11-2
 * 抽象クラスAssetを作成後これを継承するようにTangibleAssetを修正
 * p455 練習11-4
 * TangibleAssetを次の定義に沿うように修正
 * TangibleAsset(有形資産)がAsset(資産)とThing(形あるもの)の一種である
 */
public abstract class TangibleAsset extends Asset implements Thing {
    String color;
    double weight;

    public TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
