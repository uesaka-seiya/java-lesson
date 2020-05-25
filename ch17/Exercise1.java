package ch17;

/**
 * 練習1
 * 次のようなプログラムを実行しエラーを発生させる
 * ①String型変数sを宣言しnullを宣言する
 * ②s.length()の内容を表示しようとする
 */
public class Exercise1 {
    public static void main(String[] args) {
            String s = null;
            System.out.println(s.length());
    }
}
