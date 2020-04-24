package ch01;
/**
 * p58 練習1-2
 * 次のような結果を表示するソースコードを作成せよ。
 * 縦幅3横幅5の長方形の面積は、15
 * このとき次の指示に従うこと。
 * 1．ソースコード内で変数aに3を、変数bに5を入れる
 * 2．aとbの掛け算の結果を変数cに入れる
 * 3．変数cを下記のように表示する
 */
public class ex2 {
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        int c = a * b;
        System.out.println("縦幅3横幅5の長方形の面積は、" + c);
    }
}
