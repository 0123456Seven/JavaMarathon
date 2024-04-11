package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;
        while(true){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if(b>0){
                result = a/b;
                System.out.println(result);
            }
            else{
                break;
            }
        }

    }
}