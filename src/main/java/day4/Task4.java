package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int n = 20;
        int[] array = new int[n];
        Random random = new Random();
        for(int i = 0;i<array.length;i++){
            array[i] = random.nextInt(10);
        }
        int maxSum = 0;
        int sum = 0;
        int index = 0;
        for(int i = 1;i<array.length-1;i++){
            sum = array[i-1]+array[i]+array[i+1];
            if(sum>maxSum){
                maxSum = sum;
                index = i-1;
            }
            sum = 0;
        }
        System.out.println("Сумма "+maxSum);
        System.out.println("Индекс "+index);
        System.out.println(Arrays.toString(array));
    }
}
