package ch02;

/**
 * p95 練習2-1
 * "x+yは510"と表示されてしまうプログラムを"x+yは15"と表示されるよう修正せよ。
 */
public class ex1 {
    public static void main(String[] args){
        int x = 5;
        int y = 10;
        // String ans = "x+yは" + x + y;    修正前（文字列として連結されている）
        String ans = "x+yは" + (x + y);  // 修正後（x+yを()で括った）
        System .out.println(ans);
    }
}
