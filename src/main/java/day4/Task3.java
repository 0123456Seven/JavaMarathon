package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int m = scanner .nextInt();
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        int maxSum = 0;
        int sum = 0;

        for(int i = 0;i< m;i++){

            for(int j = 0;j<n; j++){
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j]+", ");
            }
            System.out.println();
        }
        for(int i = 0; i<m;i++){
            if(sum>maxSum){
                maxSum = sum;
            }
            sum = 0;
            for(int j = 0;j<n; j++){
                sum+=array[i][j];
            }
            System.out.println("sum "+i+1 + " массива = " +sum);
        }
        System.out.println(maxSum);

    }
}
