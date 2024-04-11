package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Random random = new Random();
        int countNumbersMore8 = 0;
        int countNumbersEquals1 = 0;
        int countNumbersCh = 0;
        int countNumbersNotCh = 0;
        int sumNumbers = 0;
        int[] array = new int[10];
        for(int i = 0; i<array.length;i++){
            array[i] = random.nextInt(10);
            if(array[i]>8){
                countNumbersMore8++;
            }
            if(array[i]==1){
                countNumbersEquals1++;
            }
            if(array[i]%2 == 0){
                countNumbersCh++;
            }
            if(array[i]%2>0){
                countNumbersNotCh++;
            }
            sumNumbers+=array[i];
        }
        System.out.println("Длинна массива: "+array.length);
        System.out.println("Количество чисел больше 8: "+countNumbersMore8);
        System.out.println("равные 1 "+countNumbersEquals1);
        System.out.println("четные "+countNumbersCh);
        System.out.println("нечетные "+countNumbersNotCh);
        System.out.println("Сумма "+sumNumbers);
    }
}
