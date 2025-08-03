package ex_22_OOPs_accessModifer.Criminal;

import ex_22_OOPs_accessModifer.Police.Cop;

public class SubClass extends Cop {

    public SubClass(int bullet) {
        super(bullet);
    }

    public static void main(String[] args) {
       // new SubClass().thisisDefaultF1();
       // new SubClass().canIShoot();
    }
}
