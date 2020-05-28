package ch13;

public class Hero {
    private String name;
    private int hp;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("名前を設定してください。");
        }
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("HPは0以上で設定してください。");
        }
        this.hp = hp;
    }
}
