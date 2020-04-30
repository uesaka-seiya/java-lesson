package ch05;

/**
 * p219 練習5-3
 * テキストの仕様を参考にして練習5-2のコードにメソッド「email」をオーバーロードし、mainメソッドから呼び出せ
 */
public class Exercise3 {
    public static void main(String[] args) {
        String address = "hogehoge@xxxx.co.jp";
        String text = "5月3日にオンライン新歓イベントを開催します";
        email(address, text);
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }

    public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:無題");
        System.out.println("本文:" + text);
    }
}
