package group1;

import jdk.internal.icu.impl.NormalizerImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("какого размера массив вам нужен");
        int a = scanner.nextInt();
        Random random = new Random();
        int x = 0;
        int i, j;
        int[] array = new int[a];
        for (i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(array));
        a = scanner.nextInt();
        for (int d : array) {
            if (d == a) {
                x += 1;
            }
        }
        if (x != 0) {
            System.out.println("удален елемент " +a);
            int[] array2 = new int[array.length - x];
            for (i = 0, j = 0; i < array.length; i++) {
                if (array[i] == a) {
                } else {
                    array2[j] = array[i];
                    j++;
                }
            }
            System.out.println(Arrays.toString(array2));
        } else {
            System.out.println("введите дргое число" + Arrays.toString(array));

        }
    }
}

