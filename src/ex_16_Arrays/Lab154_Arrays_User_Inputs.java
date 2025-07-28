package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Arrays_User_Inputs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");
        int size=sc.nextInt();

         //float[] number_marks=new float[size];
         // String[] number_marks=new String[size];

        int[] numbers_marks=new int[size];
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("enter the numbers");
            numbers_marks[i]=sc.nextInt();

        }
        System.out.println(" ----Below  Code is printing the elements! ");
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println(numbers_marks[i]);

        }

        
    }
}
