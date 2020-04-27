package ch03;

/**
 * p135練習3-4
 * プログラムの誤りと修正方法を示せ
 */
public class Exercise4 {
    public static void main(String[] args) {
        boolean tenki = true;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩にいきます");
        } else {    // elseの後に{}で14-15行目を挟むことでelseブロックに15行目を追加した
            System.out.println("DVDを見ます");
            System.out.println("寝ます");  // この行がelseブロックに含まれていなかった
        }
    }
}
