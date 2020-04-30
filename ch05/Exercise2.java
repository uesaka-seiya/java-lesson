package ch05;

/**
 * p218 練習5-2
 * テキストの仕様を参考にメソッド「email」を定義せよ
 * さらに定義したメソッドをmainメソッドから呼び出せ
 */
public class Exercise2 {
    public static void main(String[] args) {
        String title = "新歓イベントのお知らせ";
        String address = "hogehoge@xxxx.co.jp";
        String text = "5月3日にオンライン新歓イベントを開催します";
        email(title, address, text);
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名:" + title);
        System.out.println("本文:" + text);
    }
}
