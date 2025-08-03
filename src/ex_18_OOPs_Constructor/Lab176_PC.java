package ex_18_OOPs_Constructor;

public class Lab176_PC {
    public static void main(String[] args) {
        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);

        BabyA b3 = new BabyA("Sin","125451",1980,2,8);
        BabyA b4 = new BabyA("amit","1655451",1985,5,3);
        System.out.println(b3.name);
        System.out.println(b3.aadhar_number);
        System.out.println(b3.month);
        System.out.println(b3.year);
        System.out.println(b3.day);
    }


}

    class BabyA{
    String name;
    String aadhar_number;
    int year;
    int month;
    int day;
    //DC
    BabyA(){
        name="GUG";
        aadhar_number="000000";
        year=1970;
        month=12;
        day=2;
    }
    BabyA(String name_user,String aadhar_number_user,int year,int month,int day){
        this.name = name_user;
        this.aadhar_number= aadhar_number_user;
        this.year= year;
        this.month = month;
        this.day= day;
    }

    }
