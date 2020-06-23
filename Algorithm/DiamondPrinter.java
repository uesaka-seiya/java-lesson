package Algorithm;

/**
 * 問題2
 * 次の条件に従って、コンソールにひし形を描画するプログラムを作成。
 * ・メソッドの引数にint型の数値を渡す
 * ・ひし形の高さは引数で渡す数値によって変動する
 * (描画するひし形の例は問題を参照してください。メインメソッドは#2を参考にしました。)
 */
public class DiamondPrinter {

    /**
     * 指定の高さのひし形を文字列で返す.
     *
     * @param height 高さ
     * @return 指定の高さのひし形の文字列
     */
    public static String createDiamond(int height) {
        StringBuilder printLine = new StringBuilder();
        int middle = 2 * height - 1;
        int blank = height;
        for (int asterisk = 1; asterisk <= middle; asterisk += 2) {
            blank--;
            printLine.append("　".repeat(blank));
            printLine.append("＊".repeat(asterisk));
            printLine.append("\n");
        }
        for (int asterisk = middle - 2; asterisk >= 1; asterisk -= 2) {
            printLine.append("　".repeat(blank + 1));
            printLine.append("＊".repeat(asterisk));
            printLine.append("\n");
            blank++;
        }
        return printLine.toString();
    }

    public static void main(String[] args) {
        // 引数の数値が1の場合
        System.out.println(createDiamond(1));
        System.out.print("\n");

        // 引数の数値が2の場合
        System.out.println(createDiamond(2));
        System.out.print("\n");

        // 引数の数値が3の場合
        System.out.println(createDiamond(3));
    }
}
