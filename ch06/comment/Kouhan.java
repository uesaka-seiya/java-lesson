package ch06.comment;

/**
 * p263 練習6-1 (2)
 * commentパッケージに属するKouhanクラスを作成
 * callDeaeメソッドとshowMondokoroメソッドを定義
 *
 * p263 練習6-3
 * showMondokoroメソッドを以下のように修正
 * 「この紋所が目に入らぬか！」の後に3秒の待ち時間を入れる
 * このときAPIのjava.lang.Threadクラスを調べ、プログラムを一時停止するメソッドを呼び出すようにすること
 */
public class Kouhan {
    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
    }

    public static void showMondokoro() throws Exception {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいらぬか！");
        Thread.sleep(3000);
        Zenhan.doTogame();      // もう一度、とがめる
    }
}
