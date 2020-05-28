package ch15;

/**
 * 練習15-2
 * フォルダ名が入っている変数folderとファイル名が入っている変数fileを連結して
 * 「c:¥javadev¥readme.txt」のような完全なファイル名としての文字列を完成させるメソッドを作成
 */
public class Exercise2 {

    /**
     * パス連結メソッドconcatenatePath()
     * フォルダ名の末尾に"¥"がない場合は"¥"を付与してからファイル名と連結する
     *
     * @param folder フォルダ名(「c:¥javadev」もしくは「c:¥user¥」のような形式)
     * @param file   ファイル名(必ず「readme.txt」のような形式)
     * @return 「c:¥javadev¥readme.txt」のような完全なファイル名としての文字列を返す
     */
    public static String concatenatePath(String folder, String file) {
        if (!folder.endsWith("¥")) {
            folder += "¥";
        }
        return folder + file;
    }

    /**
     * 動作確認用メインメソッド
     */
    public static void main(String[] args) {
        String folder1 = "c:¥javadev¥";
        String folder2 = "c:¥user";
        String file = "readme.txt";
        System.out.println(concatenatePath(folder1, file));
        System.out.println(concatenatePath(folder2, file));
    }
}
