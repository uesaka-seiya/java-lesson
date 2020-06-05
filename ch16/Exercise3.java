package ch16;

import java.util.HashMap;
import java.util.Map;

/**
 * 練習16-3
 * 2人の勇者（斎藤、鈴木）をHeroとしてインスタンス化し各々の討伐数（3,7）と勇者をペアでコレクションに格納
 * 1人ずつ取り出し次のような画面を表示（表示順は不問）
 * 「斎藤が倒した敵=3」
 * 「鈴木が倒した敵=7」
 */
public class Exercise3 {
    public static void main(String[] args) {
        Hero player1 = new Hero("斎藤");
        Hero player2 = new Hero("鈴木");
        Map<Hero, Integer> heroes = new HashMap<>();
        heroes.put(player1, 3);
        heroes.put(player2, 7);
        for (Hero key : heroes.keySet()) {
            int value = heroes.get(key);
            System.out.println(key.getName() + "が倒した敵=" + value);
        }
    }
}
