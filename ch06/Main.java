package ch06;

/**
 * p263 練習6-1
 * (1) commentパッケージに属するZenhanクラスにdoWarusa()とdoTogame()を定義
 * (2) commentパッケージに属するKouhanクラスにcallDeae()とshowMondokoro()を定義
 * (3) Mainクラスにはmainメソッドだけを定義
 *      ただしMainクラスの先頭でインポートするのはZenhanクラスのみとする
 */

import ch06.comment.Zenhan;

public class Main {
    public static void main(String[] args) throws Exception {
        Zenhan.doWarusa();
        Zenhan.doTogame();
        ch06.comment.Kouhan.callDeae();
        ch06.comment.Kouhan.showMondokoro();
    }
}
