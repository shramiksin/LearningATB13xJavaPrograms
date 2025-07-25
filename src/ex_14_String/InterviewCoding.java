package ex_14_String;

import java.util.Scanner;

public class InterviewCoding {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.next();
//        String newString_reversed = reverseStringSB(input);
        String newString_reversed = reverseString(input);

        if (newString_reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        // madam.chatAt(1) -> a

    }


    static String reverseString(String userInput){
        String reversed = "";
        for (int i = userInput.length()-1; i >= 0 ; i--) {
            reversed = reversed+ userInput.charAt(i);
        }
        return reversed;
    }




    static String reverseStringSB(String userInput) {
        StringBuilder stringBuilder = new StringBuilder(userInput);
        return stringBuilder.reverse().toString();
    }
}

