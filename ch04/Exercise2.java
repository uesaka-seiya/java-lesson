package ch04;

/**
 * p176 練習4-2
 * 次の3条件を満たすプログラムを作成
 * 1. 3つの口座残高「121902」「8302」「55100」を格納したint型配列moneyListを作成
 * 2. その配列の要素を1つずつfor文で取り出し画面に表示
 * 3. 同じ配列の要素を拡張for文で1つずつ取り出して画面に表示
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] moneyList = {121902, 8302, 55100};
        System.out.println("for文で回す");
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        System.out.println("\n拡張for文で回す");
        for (int balance : moneyList) {
            System.out.println(balance);
        }
    }

}
