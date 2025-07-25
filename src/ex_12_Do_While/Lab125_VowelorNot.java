package ex_12_Do_While;

import java.util.Scanner;

public class Lab125_VowelorNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character");
        char ch= scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonants");

    }

    }
}
