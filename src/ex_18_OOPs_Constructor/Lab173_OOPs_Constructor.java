package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1=new Baby();
    }

}

    class Baby{
    // Attributes | Instance Variables | Member Variables,data members
        String name;

        // Default constructor
        Baby(){
            System.out.println("I am called, Default Constructor");
            System.out.println("Your Aadhar number is ready");

            // Fetch data from Mysql database
            // Read from csv file, XLSX
            // open a file and read the data ( json,testdata.xlsx, txt file)
        }
        void m1(){
            System.out.println("m1");
        }

    // Behaviour
    void cry()
    {
        System.out.println("cry!");
        }
        void sleep() {
            System.out.println("Sleep");
        }

        void eat(){
            System.out.println("Eat");
        }
        }


