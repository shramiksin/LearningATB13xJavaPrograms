package ex_14_String;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";

        String s3  = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");

        // == -> Comparison -> String -> this Check the location reference
        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s2==s3);

        //equals (check the content) -> value
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equalsIgnoreCase(s5));

        // equalsIgnoreCase-> Hello hello
        // == -> check for the reference
        // = assignment the value
    }
}
