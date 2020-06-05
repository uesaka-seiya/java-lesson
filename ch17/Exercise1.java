package ch17;

/**
 * 練習1
 * 次のようなプログラムを実行し実行時エラーを発生させる
 * ①String型変数sを宣言しnullを宣言する
 * ②s.length()の内容を表示しようとする
 * 練習2
 * 17-1で作成したコードをtry-catch文を用いて例外処理するよう修正
 * 例外処理では次の動作を行う
 * ①「NullPointerException 例外をcatchしました」と表示
 * ②「--スタックトレース（ここから）--」と表示
 * ③スタックトレースを表示
 * ④「--スタックトレース（ここまで）--」と表示
 */
public class Exercise1 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 例外をcatchしました");
            System.out.println("--スタックトレース（ここから）--");
            e.printStackTrace(System.out);
            System.out.println("--スタックトレース（ここまで）--");
        }
    }
}
