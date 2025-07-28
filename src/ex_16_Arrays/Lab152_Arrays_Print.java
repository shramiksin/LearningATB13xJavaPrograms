package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        int[] marks={90,89,87,98,75,96};
        System.out.println(" -------");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

          //  System.out.println(marks);  It will print Reference Address
        }
        Arrays.sort(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}
