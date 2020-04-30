package ch03;

/**
 * p137 練習3-6
 * 条件に従って【数あてゲーム】を作成
 * 1. 画面に【数あてゲーム】を表示
 * 2. 0から9の乱数をanswerに代入
 * 3. 5回繰り返すループ
 * 4. 画面に"0〜9の数字を入力してください"を表示
 * 5. 数字を入力し変数numberに代入
 */
public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("【数あてゲーム】");
        int answer = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("0〜9の数字を入力してください");
            int number = new java.util.Scanner(System.in).nextInt();
            if (number == answer) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
