package ex_20_OOPs_Polymorphism.methodoverloading;

public class Calculator {
    public static void main(String[] args) {
    Calc c1  = new Calc();
    c1.add(3,5);
    c1.add(7.1,9.8);
    }
}
class Calc {
    //int attribute;

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
