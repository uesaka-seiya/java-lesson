package Algorithm;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * 問題4
 * 500円、100円、50円、10円、5円、1円がそれぞれ何枚あるかを管理する貯金箱のクラスCoinCaseを作成。
 * CoinCaseクラスを使用して次のプログラムを作成。
 * ・CoinCase クラスのインスタンスを作成する。
 * ・種類と枚数を入力し、addCoins メソッドで硬貨を追加することを 10 回繰り返す。
 * ・getCountメソッドで各硬貨が何枚あるかを表示する。
 * ・getAmountメソッドで総額を表示する。
 * (スプレッドシート「Java教育（アルゴリズム）」のシート#4も参考にして作成しました)
 */
public class CoinCase {
    private Map<Integer, Integer> coins = new HashMap<>();

    private CoinCase() {
        this.coins.put(500, 0);
        this.coins.put(100, 0);
        this.coins.put(50, 0);
        this.coins.put(10, 0);
        this.coins.put(5, 0);
        this.coins.put(1, 0);
    }

    /**
     * 硬貨を追加するメソッド。
     * 500円、100円、50円、10円、5円、1円以外の硬貨が入った場合は例外を投げる。
     *
     * @param coinType 硬貨の種類
     * @param count 枚数
     */
    public void addCoins(int coinType, int count) {
        if (coins.containsKey(coinType)) {
            this.coins.put(coinType, getCount(coinType) + count);
        } else {
            throw new IllegalArgumentException("存在する硬貨を入力してください");
        }
    }

    /**
     * 指定した硬貨が何枚あるかを取得するメソッド.
     *
     * @param coinType 硬貨の種類
     * @return 硬貨の枚数
     */
    public int getCount(int coinType) {
        int count = this.coins.get(coinType);
        return count;
    }

    /**
     * 硬貨の総額を取得するメソッド
     *
     * @return 硬貨の総額
     */
    public int getAmount() {
        int total = 0;
        for (Integer key : this.coins.keySet()) {
            total += key * this.getCount(key);
        }
        return total;
    }


    public static void main(String[] args) {
        CoinCase myCase = new CoinCase();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("\n追加する硬貨の 種類 は？");
                int coinType = new Scanner(System.in).nextInt();
                System.out.println("追加する硬貨の 枚数 は？");
                int count = new Scanner(System.in).nextInt();
                myCase.addCoins(coinType, count);

                System.out.println("500円は" + myCase.getCount(500) + "枚");
                System.out.println("100円は" + myCase.getCount(100) + "枚");
                System.out.println("50円は" + myCase.getCount(50) + "枚");
                System.out.println("10円は" + myCase.getCount(10) + "枚");
                System.out.println("5円は" + myCase.getCount(5) + "枚");
                System.out.println("1円は" + myCase.getCount(1) + "枚");
                System.out.println("総額は" + myCase.getAmount() + "円");
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("入力エラー: 整数を入力してください");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("入力エラー: " + illegalArgumentException.getMessage());

        }
    }
}

