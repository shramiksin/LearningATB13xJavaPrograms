package ex_19_OOPs_Inheritance;

public class Lab178_Inheritance {
    public static void main(String[] args) {
        Father f1=new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();
    }



}

class Father{
    int gold_f=1000; //Attribute | Data variable | Property | Instance Variable

    void bhk2(){  // Behaviour | Method | Function |Data Members
        System.out.println("Father - 2BHK");
    }
}

class Son extends Father{
//    int gold_f=1000; //Attribute | Data variable | Property | Instance Variable
//
        void bhk3(){  // Behaviour | Method | Function |Data Members
       System.out.println("Father - 2BHK");
  }

}
