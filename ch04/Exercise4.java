package ch04;

/**
 * p177 練習4-4
 * 「数あてクイズ」のプログラムを作成
 * 1. int型で要素数3の配列numbersを準備する（初期値は各々「3」「4」「9」）
 * 2. 画面に「1桁の数字を入力してください」と表示
 * 3. 指定された下記コードを用いてキーボードから数字の入力を受け付け、変数inputに代入
 *      int input = new java.util.Scanner(System.in).nextInt();
 * 4. 配列をループで回しながら、いずれかの要素と等しいかを調べる。等しい場合は「アタリ！」と表示。
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};
        System.out.println("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int number : numbers) {
            if (input == number) {
                System.out.println("アタリ！");
            }
        }
    }
}
