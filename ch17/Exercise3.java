package ch17;

/**
 * 練習17-3
 * Integer.parseIntメソッドを実行し、
 * 文字列"三"の変換結果をint型変数iに代入するコードを記述
 * その際parseIntメソッドに発生しうる例外をAPIリファレンスで調べ正しく例外処理を行う
 */
public class Exercise3 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("三");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

}
