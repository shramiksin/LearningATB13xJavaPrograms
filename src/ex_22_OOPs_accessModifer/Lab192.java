package ex_22_OOPs_accessModifer;

public class Lab192 {
    public static void main(String[] args) {

    }
}

class Father{
    private int gold=10;
    int car = 1;
    public int bhk3=1;

}
class Son extends Father{
    void weCanUse(){
       // System.out.println(gold);
        System.out.println(car);
        System.out.println(bhk3);

    }
}