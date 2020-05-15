package ch13;

public class Hero {
    private String name;
    private int hp;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前がnullのため処理を中断しました。");
        }
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("HPが0未満のため処理を中断しました。");
        }
        this.hp = hp;
    }
}
