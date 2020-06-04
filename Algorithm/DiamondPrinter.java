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
    public String createDiamond(int height) {
        String printLine = "";
        int middle = 2 * height - 1;
        int blank = height;
        for (int asterisk = 1; asterisk <= middle; asterisk += 2) {
            blank--;
            addBlank(blank, printLine);
            addAsterisk(asterisk, printLine);
            addBlank(blank, printLine);
            printLine += "\n";
        }
        for (int asterisk = middle - 2; asterisk >= 1; asterisk -= 2) {
            addBlank(blank + 1, printLine);
            addAsterisk(asterisk, printLine);
            addBlank(blank + 1, printLine);
            printLine += "\n";
            blank++;
        }
        return printLine;
    }

    /**
     * 文字列変数に指定した数だけアスタリスクを追加するメソッド
     *
     * @param asterisk  指定するアスタリスクの数
     * @param printLine 追加先の文字列変数
     */
    public void addAsterisk(int asterisk, String printLine) {
        for (int i = 1; i <= asterisk; i++) {
            printLine += "＊";
        }
    }

    /**
     * 文字列変数に指定した数だけスペースを追加するメソッド
     *
     * @param blank     指定するスペースの数
     * @param printLine 追加先の文字列変数
     */
    public void addBlank(int blank, String printLine) {
        for (int i = 1; i <= blank; i++) {
            printLine += "　";
        }
    }

    public static void main(String[] args) {
        DiamondPrinter diamondPrinter = new DiamondPrinter();
        // 引数の数値が1の場合
        diamondPrinter.createDiamond(1);
        System.out.print("\n");

        // 引数の数値が2の場合
        diamondPrinter.createDiamond(2);
        System.out.print("\n");

        // 引数の数値が3の場合
        diamondPrinter.createDiamond(3);
    }
}
