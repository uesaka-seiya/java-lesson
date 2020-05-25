package ch16;

import java.util.ArrayList;
import java.util.List;

/**
 * 練習16-2
 * 2人の勇者（斎藤、鈴木）をHeroとしてインスタンス化しArrayListに格納
 * 1人ずつ順番に取り出して名前を表示
 */
public class Exercise2 {
    public static void main(String[] args) {
        Hero player1 = new Hero("斎藤");
        Hero player2 = new Hero("鈴木");
        List<Hero> heroes = new ArrayList<Hero>();
        heroes.add(player1);
        heroes.add(player2);
        for (Hero hero : heroes) {
            System.out.println(hero.getName());
        }
    }
}
