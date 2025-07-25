package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->


        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters


        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = 0;
        if (scanner.hasNextInt()) {
            a=scanner.nextInt();
        } else {
            System.out.println("Enter the int only");
          //   return;
            System.exit(0);
        }

        System.out.println("Enter the num2");
        int b = 0;
        if(scanner.hasNextInt()) {
            b=scanner.nextInt();
        } else {
            System.out.println("Enter the int only");
            // return;
            System.exit(0);
        }

        int result_sum=sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);
        int result_mod=mod(a,b);

    }

    /**
     * Add two integers
     *
     * @param a the first intger
     * @param b the second integer
     * @return the sum of a and b
     */
    static int sum(int a, int b) {
        return a+b;
    }

    static int sub(int a, int b) {
        return a-b;
}
    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a ,int b) {
        if(b==0) {
           // System.out.println("b can't be zero");
            throw new ArithmeticException("b can't be zero");
        }
        return a/b;
    }
    static int mod(int a, int b) {
        return a%b;
    }
}
