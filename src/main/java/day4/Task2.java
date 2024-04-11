package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        Random random = new Random();
        for(int i = 0; i<100;i++){
            array[i] = random.nextInt(10000);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countSuffix0 = 0;
        int sumSuffix0 = 0;
        for(int i = 0;i<100; i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]%10==0){
                countSuffix0++;
                sumSuffix0+=array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);
        System.out.println(countSuffix0);
        System.out.println(sumSuffix0);
    }
}
