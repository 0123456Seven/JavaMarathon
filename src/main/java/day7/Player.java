package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers<6){
            countPlayers++;
        }

    }

    public int getStamina() {
        return stamina;
    }
    public void run(){
        if(stamina == 0){
            countPlayers--;
        }
        else{
            stamina--;
        }
    }
    public void info(){
        if(countPlayers<6){
            System.out.println("Команды неполные. На поле еще есть "+(6-countPlayers));
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
