package ex_19_OOPs_Inheritance.multilevel_inheritance;

public class Lab181_Multil_Levle {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gf();

        System.out.println(" --- ");

        Father f1 = new Father();
        f1.f();
        f1.gf();

        Son s1 = new Son();
       // s1.gf();
        s1.s();
       // s1.f();

    }
}
