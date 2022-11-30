package group1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int[] nums = new int[]{1, 3, 4, 5, 63, 2, 45, 4};

        for (int i = 0; i < nums.length; i++) {
            if (a == nums[i]) {
                System.out.println("число входит в массив под инжексом №"+i);


            }
        }
    }
}
