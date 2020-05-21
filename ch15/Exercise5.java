package ch15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 練習15-5
 * TimeAPIを用いて「現在から100日後の日付」を「西暦2020年09月24日」という形式で表示するプログラムを作成
 */
public class Exercise5 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(now.plusDays(100).format(format));
    }
}
