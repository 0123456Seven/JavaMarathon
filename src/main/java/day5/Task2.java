package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike =new Motorbike(1934, "RED", "BMW");
        System.out.println(motorbike.getColor()+", "+motorbike.getModel()+", "+motorbike.getYear());
    }
}
