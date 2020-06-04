package Algorithm;

import java.util.Arrays;
import java.util.InputMismatchException;

/**
 * 問題3
 * 数値を10回入力して昇順に並べ替えて表示するプログラムを作成。
 * 整数ではない値が入力された場合は例外を投げて処理を中断し、下記のメッセージをコンソールに表示する。
 * 表示するメッセージ：不正な値が入力されたため処理を中断しました。値は整数で入力してください。
 */
public class Sort {

    /**
     * 配列の要素(整数値)を昇順に並べ替えて(バブルソート)表示するメソッド
     *
     * @param numbers 整数値を要素とする配列
     */
    public static void ascendingOrder(int[] numbers) {
        int size = numbers.length;
        for (int j = 0; j < size - 1; j++) {
            for (int i = 0; i < size - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    /**
     * 数値を10回入力して昇順に並べ替えて表示するメインメソッド
     * 整数ではない値が入力された場合は例外を投げて処理を中断しメッセージを表示する
     */
    public static void main(String[] args) {
        int[] inputNumbers = new int[10];
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("整数を入力してください。");
                int value = new java.util.Scanner(System.in).nextInt();
                inputNumbers[i] = value;
            }
            ascendingOrder(inputNumbers);
            System.out.println(Arrays.toString(inputNumbers));
        } catch (InputMismatchException e) {
            System.out.println("不正な値が入力されたため処理を中断しました。値は整数で入力してください。");
        }
    }
}
