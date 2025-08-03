package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab187_Real_Moverloading {
    public static void main(String[] args) {
        home h1 =new home();
        h1.task(3);
        h1.task(true);

    }
}

class home{
    void task(){
        System.out.println("Task 1");

    }
    int task(int a){
        System.out.println("Task 1");
        return a;
    }
    boolean task(boolean a){
        return false;
    }

}
