package group1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = scanner.nextInt();
        int[] array1 = new int[a];
        double sum1 = 0.0;
        double ar1 = 0.0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(15);
            sum1 = (sum1 + array1[i]);
            ar1 = sum1 / array1.length;
        }
        System.out.println(ar1);
        System.out.print(Arrays.toString(array1));
        System.out.println(" ");
        int b = scanner.nextInt();
        int[] array2 = new int[b];
        double sum2 = 0.0;
        double ar2 = 0.0;
        for (int j = 0; j < array1.length; j++) {
            array2[j] = random.nextInt(15);
            sum2 = (sum2 + array2[j]);
            ar2 = sum2 / array2.length;
        }System.out.println(ar2);
        System.out.print(Arrays.toString(array2));
        System.out.println(" ");

        if(ar1<ar2) {
            System.out.println("greater value "+ar2);
        }else if(ar1>ar2) {
            System.out.println("greater value "+ar1);
        }else{
            System.out.println("values equal");
        }
    }
}