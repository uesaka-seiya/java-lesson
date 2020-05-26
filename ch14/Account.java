package ch14;

/**
 * p552 練習14-1
 * 口座番号を表すString型のフィールドaccountNumberと
 * 残高を表すint型のフィールドbalanceを持つ銀行口座クラスAccountを作成。
 * このクラスにメソッドを追加し、以下の二つの条件を満たすようにする。
 * ①口座番号4649、残高1592円のaccountインスタンスを変数aに生成し
 * 「system.out.println(a)」を実行すると、画面に「¥1592(口座番号 = 4649)」と表示
 * ②口座番号が等しければ等価と判断する
 * (口座番号の先頭に半角スペースが付けられた場合も、スペースを無視して判断する)
 */
public class Account {

    /**
     * 口座番号
     */
    private String accountNumber;

    /**
     * 残高(円)
     */
    private int balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    /**
     * ①文字列表現のメソッド
     *
     * @return 残高と口座番号を指定形式の文字列で返す
     */
    @Override
    public String toString() {
        return "¥" + this.balance + "(口座番号= " + this.accountNumber + ")";
    }

    /**
     * ②等価判定のメソッド
     * 口座番号が等しければ等価と判定する
     * 口座番号の前後に半角スペースがある場合はスペースを無視して判定する
     *
     * @param other 比較対象のAccountインスタンス
     * @return 等価:true, 不等価: false
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Account) {
            Account account = (Account) other;
            return this.accountNumber.trim().equals(account.accountNumber.trim());
        }
        return false;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
