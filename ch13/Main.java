package ch13;

public class Main {
    public static void main(String[] args) {
        Hero player1 = new Hero();
        player1.setName("ミナト");
        player1.setHp(100);

        Wand lightWand = new Wand();
        lightWand.setName("ひかりの杖");
        lightWand.setPower(10);

        Wizard player2 = new Wizard();
        player2.setName("アサカ");
        player2.setHp(100);
        player2.setMp(5);
        player2.setWand(lightWand);

        player2.heal(player1);
    }
}
