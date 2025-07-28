package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] Sin) {

        for (int i = 0; i < Sin.length; i++) {
            System.out.println(Sin[i]);
        }
        System.out.println(" -- ");
        for (String arg : Sin) {
        System.out.println(arg);
    }

    }
}
