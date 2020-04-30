package ch05;

/**
 * p218 練習5-1
 * テキストの仕様に従いメソッド「introduceOneself」を定義せよ
 * さらに定義したメソッドをmainメソッドから呼び出せ
 */
public class Exercise1 {
    public static void main(String[] args) {
        introduceOneself();
    }
    public static void introduceOneself() {
            String name = "上坂静耶";
            int age = 23;
            double height = 156.3;
            char zodiac = '子';
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age);
        System.out.println("身長: " + height);
        System.out.println("十二支: " + zodiac);
    }
}
