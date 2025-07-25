package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0 ="Sin";
        String s1 = new String("Sin");

        StringBuffer stringBuffer = new StringBuffer("Sin");
        StringBuilder stringBuilder = new StringBuilder("Sin");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

    }
}
