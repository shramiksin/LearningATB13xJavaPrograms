package ex_21_OOPs_Encapsulation;

public class Lab191_REAL_BANK {
    public static void main(String[] args) {
        ICICIBank Sin = new ICICIBank("Sin",200);
        long bal =Sin.getBal();
        System.out.println(bal);
        Sin.setBal(500,true);
        long bal2 = Sin.getBal();
        System.out.println(bal2);

    }
}
class ICICIBank{
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal,boolean isCashier) {
        this.bal = bal;
    }
}