package ex_19_OOPs_Inheritance.multilevel_inheritance;

public class Lab183_Multil_LEVEL {
    public static void main(String[] args) {
        //Son s1 = new Father();
      //  Son s2 = new GrandFather();
        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

        GrandFather grandfather = new Son();
        grandfather.home();

    }
}
