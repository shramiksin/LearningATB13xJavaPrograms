package ex_10_For_Loop;

public class Lab102_For_No_Condition {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {  //infinite loop because no condition
            System.out.println(i);

        }
        //exit code 130(Stop by yourself-kill) Red button - interrupted by signal
        //exit code 0 - successful
    }
}
