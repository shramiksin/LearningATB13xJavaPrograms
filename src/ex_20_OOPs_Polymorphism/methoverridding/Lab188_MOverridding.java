package ex_20_OOPs_Polymorphism.methoverridding;

public class Lab188_MOverridding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
    }
}

class Animal{

    void sound(){
        System.out.println("Default Sound!");
    }

    void A(){}
}

class Dog extends Animal{

    @Override
    void sound(){
        System.out.println("Bark!!");
    }

    void methodOverLoad(){

    }

    void methodOverLoad(int a){

    }




}

