package ex_16_Arrays;

import java.util.Scanner;

public class Lab165_2D_Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("Enter the n e.g. n=3");
        Scanner scannner = new Scanner(System.in);
        int size_of_the_table = scannner.nextInt();
        for (int i = 0; i < size_of_the_table; i++) {
            for (int j = 0; j < size_of_the_table; j++) {
                System.out.print(i*j + "  ");

            }
            System.out.println();

        }
    }
}
