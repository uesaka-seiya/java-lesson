package ch17;

import java.io.IOException;

/**
 * 練習17-4
 * 起動直後にIOExceptionを送出して異常終了するようなプログラムを作成
 */
public class Exercise4 {
    public static void main(String[] args) throws IOException {
        System.out.println("プログラムが起動しました");
        throw new IOException();
    }
}
