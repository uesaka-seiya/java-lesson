package ch14;

/**
 * p552 練習14-2
 * 聖職者Clericクラスの最大HPは50、最大MPは10と決まっている
 * 最大HPと最大MPのフィールドが各インスタンスに保持されないように
 * フィールド宣言に適切なキーワードを追加せよ
 * （MAX_HPとMAX_MPにstatic修飾子を追加した）
 */
public class Cleric {
    private String name;
    private int hp;
    private static final int MAX_HP = 50;
    private int mp;
    private static final int MAX_MP = 10;

    public Cleric(String name) {
        this.name = name;
        this.hp = 50;
        this.mp = 10;
    }

    /**
     * 自己回復メソッド
     * 自分のMPを5消費して自分のHPを最大HPまで回復する
     */
    public void selfAid() {
        System.out.println(this.name + "は セルフエイドを となえた！");
        if (this.mp >= 5) {
            this.hp = MAX_HP;
            this.mp -= 5;
            System.out.println("HPが さいだいまで かいふくした");
        } else {
            System.out.println("しかし MPが たりない！");
        }
    }

    /**
     * MP回復メソッド
     * 祈ると自分のMPのが回復する
     * 回復量は祈った秒数にランダムで0〜2ポイントの補正を加えた値
     * ただし最大MPを超過することはない
     *
     * @param sec 祈る秒数
     * @return 実際に回復したMPの量
     */
    public int pray(int sec) {
        System.out.println(this.name + "は " + sec + "秒間 祈った！");
        int recover = new java.util.Random().nextInt(3) + sec;
        int recoverActual = Math.min(recover, MAX_MP - this.mp);
        this.mp += recoverActual;
        System.out.println("MPが " + recoverActual + " かいふくした！");
        return recoverActual;
    }

    @Override
    public String toString() {
        return "聖職者{" +
                "名前: '" + name + '\'' +
                ", HP: " + hp +
                ", MP: " + mp +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 1) {
            throw new IllegalArgumentException("名前は1文字以上で設定してください");
        }
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0 || hp > MAX_HP) {
            throw new IllegalArgumentException("HPは0以上" + MAX_HP + "以下で設定してください");
        }
        this.hp = hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        if (mp < 0 || mp > MAX_MP) {
            throw new IllegalArgumentException("MPは0以上" + MAX_MP + "以下で設定してください");
        }
        this.mp = mp;
    }
}
