package ex_13_Functions;

public class Lab132_UD_Part1 {

    // User defined Functions

    //1. Without Parameters and without Return Type
    //2. Without Parameters but with Return Type
    //3. With Parameters and without Return Type
    //4. With Parameters and with Return Type
    public static void main(String[] args) {
        // 1. Without Parameters and without Return Type
        wp_wr_greet();

        //2. Without Parameters and with Return Type
        String msg=greet_with_hello_wp_with_RT();
        System.out.println(msg);

        //3. With Parameters and without Return Type
        greet_with_details("john", 65,100);
        greet_with_details( "live",80,120);

        //4. With Parameters and with Return Type
                int sum=sum_of_two_numbers(3,4,5);
                int sum2= sum_of_two_numbers(4,9,2);
                int sum3 = sum_of_two_numbers(100,200,100);
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(sum3);



    }

    //1. Without Parameters and without Return Type. (Declare) /Define
    static void wp_wr_greet() {
        System.out.println("-- Type1: Without Parameters and without Return Type");
        System.out.println("Hi, How are you?");
    }

    //2. Without Parameters and with Return Type
    static String greet_with_hello_wp_with_RT() {
        System.out.println("-- Tyoe 2: Without Parameters and with Return Type");
        System.out.println("wp_with_RT");
        return "Hi, are you?";
    }

    //3. With Parameters and without Return Type(90%)
    static void greet_with_details(String name,int age,double salary) {
        System.out.println("Your name is->"+name +" \n Your age is" + age + "\nYour salary is"+salary);
    }

    //4. With Parameters and with Return Type
    static int sum_of_two_numbers(int a, int b, int c) {
        return a+b+c;
    }
}
