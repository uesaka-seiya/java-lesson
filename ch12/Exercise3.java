package ch12;

/**
 * p489 練習12-3(2)
 * 以下のプログラムを作成せよ。
 * 練習12-2で用いたAクラスやBクラスのインスタンスをそれぞれ1つずつ生成し、要素数2からなる単一の配列に格納する。
 * 格納後に配列の中身をループで順に取り出し、各々のインスタンスのb()を呼ぶ必要がある。
 */
public class Exercise3 {
    public static void main(String[] args) {
        Y[] array = new Y[2];
        array[0] = new A();
        array[1] = new B();
        for (Y y : array) {
            y.b();
        }
    }
}
