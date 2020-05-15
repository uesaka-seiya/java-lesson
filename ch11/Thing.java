package ch11;

/**
 * p455 練習11-3
 * インタフェース Thing を定義
 * これはdouble型の重さを取得するメソッドgetWeight()とdouble型の重さを設定するメソッドsetWeight()を持つ
 */
public interface Thing {
    double getWeight();
    void setWeight (double weight);
}
