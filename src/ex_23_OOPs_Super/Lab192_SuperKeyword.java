package ex_23_OOPs_Super;

public class Lab192_SuperKeyword {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();
    }
}
class Vehicle{
    public int maxSpeed=180;

    Vehicle(){
        System.out.println("Default C");
    }
    Vehicle(int a){
        System.out.println("Param Con");
        System.out.println("Param Con" +a);
    }
    // Method Overloading - Same, Same name function with different arguments
    void message(int a){
        System.out.println("Type 2");
    }
    void message(){
        System.out.println("Type 1");
    }
    int message(String a){
        System.out.println("Type 4");
        return 0;
    }
    void display(){
        System.out.println("Vehicle Parent");
    }

}

class Car extends Vehicle{
    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    Car(){
        super();


    }
    Car(int a){
        super(10); // Parents parametrized Constructor

    }

    @Override
    void display() {

        System.out.println(super.maxSpeed); // instance variable call
        System.out.println(this.maxSpeed); // This means my variable call
        System.out.println("Hi Override");
    }
}
