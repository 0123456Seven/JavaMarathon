package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(5);
        Player player2 = new Player(3);
        System.out.println(Player.countPlayers);
        player2.info();
    }
}
