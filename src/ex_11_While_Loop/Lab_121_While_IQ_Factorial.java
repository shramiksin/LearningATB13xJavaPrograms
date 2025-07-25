package ex_11_While_Loop;
import java.math.BigInteger;
import java.util.Scanner;

public class Lab_121_While_IQ_Factorial {
    public static void main(String[] args) {
        // Factorial program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\n Enter the number");
        if (!scanner.hasNextInt()) {
            System.out.println("Enter the int you fool");
            return;
        }

        int number = scanner.nextInt();

        long factorial = 1;
        if (number<0) {
            System.out.println("Negative factorial is not allowed");
        }
        if (number <= 0) {
            System.out.println(factorial);
        } else {
            // calculate the factorial
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

        }
        System.out.println("Factorial is ->" + factorial); //print the calculated
    }
}

