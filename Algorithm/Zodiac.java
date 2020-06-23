package Algorithm;

/**
 * 問題1
 * 西暦から干支を算出するプログラムを作成せよ。
 * 算出した結果を元に下記のようなメッセージをSystem.out.printで表示する。
 * (メインメソッドはサンプルコード(スプレッドシートの#1を参考にした)
 */
public class Zodiac {

    /**
     * 引数から干支の名前を求めるメソッド.
     *
     * @param year 西暦
     * @return 干支の名前
     */
    public static String getNameByYear(int year) {
        String[] zodiac = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
        int mod = year % 12;
        if (mod < 4) {
            return zodiac[mod + 8];
        }
        return zodiac[mod - 4];
    }

    /**
     * 引数から算出結果を出力するメソッド
     *
     * @param year 西暦
     */
    public static void outputMessage(int year) {
        System.out.println(year + "の干支は" + Zodiac.getNameByYear(year) + "です。");
    }

    public static void main(String[] args) {
      for (int i = 2020; i < 2032; i++) {
        outputMessage(i);
      }
    }
}
