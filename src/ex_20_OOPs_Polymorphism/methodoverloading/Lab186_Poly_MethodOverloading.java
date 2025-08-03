package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab186_Poly_MethodOverloading {
    public static void main(String[] args) {
    MathOperations m1 =new MathOperations();
    int r1=m1.add(3,5);
    int r2=m1.add(5,7,9);
    double r3= m1.add(3.14,4.55);
    String r4 = m1.add("S","Sin");


    }

}
class MathOperations{
    //In the same class,When you have a method with same
    // Same name methods but different arguments and different return type

    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b ) {
        return a + b;
    }
    String add(String a,String b) {
        return a + b;
    }
}
