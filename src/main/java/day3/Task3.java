package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<5;i++){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double result = 0;
            if(b==0){
                System.out.println("Введен 0");
                continue;
            }
            result = a/b;
            System.out.println(result);

        }
    }
}
