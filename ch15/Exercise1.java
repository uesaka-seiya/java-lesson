package ch15;

/**
 * 練習15-1
 * 1から100までの整数をカンマで連結した以下のような文字列sを生成するコードを作成
 * "1,2,3,...,98,99,100,"
 * 完成した文字列sをカンマで分割しString配列aに格納
 */
public class Exercise1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i + 1).append(",");
        }
        String s = stringBuilder.toString();
        System.out.println(s);
        String[] a = s.split(",");
        for (String number : a) {
            System.out.print(number + " ");
        }
    }
}
