/*package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab122_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 to 100
        // Random 1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; //0 to 100
        //System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int guess;
        int attempts = 0;
        while (true)
            // System.out.println("Enter another guess");
            guess = scanner.nextInt();
       // attempts++;

        if(guess < numberToGuess) {
            System.out.println("Too low, try again");
        } else if (guess > numberToGuess) {
            System.out.println("Too high, try again");
        } else {
            System.out.println("Correct! You guessed it in" + attempts + "attempts");
        }
    }
}*/

import java.util.Random;
import java.util.Scanner;

public class Lab122_While_Guessing_Game {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100:");

        int guess;
        int attempts = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt(); // take input from user
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low, try again");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break; // exit the loop when guessed correctly
            }
        }

        scanner.close(); // close the scanner to avoid memory leak
    }
}
