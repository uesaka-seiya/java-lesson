package ch03;

/**
 * p135 練習3-3
 * 指示に沿ったプログラムを作成
 */
public class Exercise3 {
    public static void main(String[] args) {
        int isHungry = 1;
        String food = "りんご";
        System.out.println("こんにちは");
        if (isHungry == 0){
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
        }
        if (isHungry == 1){
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");
    }
}