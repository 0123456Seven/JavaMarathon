package day6;


public class  Task1 {
    public static void main(String[] args) {
        Motorbike motorbike =new Motorbike(1934, "RED", "BMW");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2000));

    }
}
