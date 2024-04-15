package day7;

public class Airplane
{
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }

    public int getFuel() {
        return fuel;
    }
    public void info(){
        System.out.println("Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлева в баке: "+fuel);

    }
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.length>airplane2.length){
            System.out.println("Самолет 1 длиннее");
        }
        else{
            System.out.println("Самолет 2 длиннее");
        }
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void fillUp(int number){
        fuel+=number;
    }
}
