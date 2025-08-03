package ex_19_OOPs_Inheritance.Single_inheritance;

public class Lab179_real_si {
    public static void main(String[] args) {
        TestCase1 t1=new TestCase1();
        t1.runningTC1();
        TestCase2 t2 = new TestCase2();
        t2.runningTC2();

        CommonToAll c1 = new TestCase1();
        TestCase1 t3= new TestCase1();
        CommonToAll c2= new TestCase1(); // Dynamic Dispatch (EXTENDS)
      //  TestCase1 c4 = new CommonToAll();
       // WebDriver driver = new ChromeDriver();

    }
}
