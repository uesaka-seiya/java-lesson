package ch05;

/**
 * p219 練習5-4
 * テキストの仕様を参考にメソッド「」と「」を作成せよ。
 * mainメソッドからそれぞれのメソッドに適当な引数を渡して呼び出し、
 * 戻り値を出力して正しい面積が表示されるか確認せよ。
 */
public class Exercise4 {
    public static double calcTriangleArea(double bottom, double height) {
        double area = bottom * height / 2;
        return area;
    }

    public static double calcCircleArea(double radius) {
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }

    public static void main(String[] args) {
        double triangleArea = calcTriangleArea(10.0, 5.0);
        double circleArea = calcCircleArea(5.0);
        System.out.println("三角形の面積:" + String.format("%.1f", triangleArea) + "平方cm");
        System.out.println("円の面積:" + String.format("%.1f", circleArea )+ "平方cm");
    }
}
