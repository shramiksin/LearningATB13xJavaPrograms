package ex_17_OOPs;

public class Person {
    // These are called Properties,attributes,instance variables,member variable
    String name;
    int age;
    String height;
    String gender;
    boolean is_married;

    // These are called Behaviours,Member Functions, Functions,Methods
    void walk(){
        System.out.println("walking");
    }
    String sleep(){
        System.out.println("Sleeping");
        return null;
    }
    String eat(String food){
        System.out.println("Eating");
        return null;
    }
    String food(){
        System.out.println("Foods");
        return null;
    }
}
