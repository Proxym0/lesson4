package group2;

import java.util.Arrays;
import java.util.Random;

public class Class2 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.print(Arrays.toString(array));
        System.out.println(" ");
        for (i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.print(Arrays.toString(array));
    }
}
