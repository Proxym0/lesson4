package group1;

import java.util.Arrays;
import java.util.Scanner;

public class Class3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] nums = new int[a];
        double sum=0;
        for (int i = 0; i < a; i++) {
            nums[i] = (int) (Math.random() * 10);
            sum = nums[i] + sum;
            System.out.print(" "+nums[i]);
        }

        System.out.println("");
        System.out.println(Arrays.stream(nums).max());
        System.out.println(Arrays.stream(nums).min());
        System.out.println(sum/nums.length);
    }
}
