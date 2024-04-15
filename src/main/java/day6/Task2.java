package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Самолет", 2003, 100, 200);
        airplane.fillUp(200);
        airplane.fillUp(300);
        airplane.setLength(300);
        airplane.setYear(2024);
        airplane.info();
    }
}
