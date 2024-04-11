package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1929);
        car.setModel("Porshe");
        car.setColor("RED");
        System.out.println(car.getModel()+", "+ car.getYear()+", "+car.getColor());
    }
}
