package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab_147_SBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append("World"); // Appends text
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
