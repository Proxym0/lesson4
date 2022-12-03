package group2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        Random random=new Random();
        int[] array=new int[a];
        int i;
        int evenNums = 0;
        for(i=0;i<a;i++){
            array[i]=random.nextInt(10);
            if(array[i]%2 == 0){
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(array));
        int [] array1 = new int[evenNums];
        int index = 0;
        for (i = 0; i < a; i++) {
            if(array[i]%2 == 0){
                array1[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array1));
        if(a<5||a>10) {
                System.out.println("array size is invalid");
            }else{
                System.out.println("");
            }

        }
    }


