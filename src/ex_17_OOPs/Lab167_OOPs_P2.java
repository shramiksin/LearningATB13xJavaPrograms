package ex_17_OOPs;

public class Lab167_OOPs_P2 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2;
        new Student();
        s1.name="Sin";
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    // Is called as the default constructor, same name as the same class name
    Student(){
        System.out.println("DC");
    }

    void sleep(){
        System.out.println("Sleeping");

    }
}
