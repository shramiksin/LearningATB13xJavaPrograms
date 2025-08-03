package ex_20_OOPs_Polymorphism.methoverridding;

public class Lab189_Methodoverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1=new ChromeTC();
        c1.openBrowser();

        Firefox f1= new Firefox();
        f1.openBrowser();


        CommonToAll commonToAll=new CommonToAll();
        commonToAll.openBrowser();

        // Dynamic Dispatch
        CommonToAll c2 =new ChromeTC();
        c2.openBrowser();

        CommonToAll c3 =new Firefox();
        c3.openBrowser();

//        Firefox f2 =new ChromeTC();
//        f2.openBrowser();
    }
}
class CommonToAll{
    void openBrowser(){
        System.out.println("Starting IE Browser!");
    }

}
class ChromeTC extends CommonToAll{
    @Override
    void openBrowser() {
        System.out.println("Starting Chrome Browser");

    }
}
class Firefox extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("Starting Firefox Browser");

    }
}