package ex_21_OOPs_Encapsulation;

public class Lab190_Ecap_Demo {
    public static void main(String[] args) {
        VWOlogin vwOlogin = new VWOlogin("admin","pass123");
        System.out.println(vwOlogin.password);
        vwOlogin.password="1234";
        System.out.println(vwOlogin.password);

        GoodVWOLogin vwoLogin1=new GoodVWOLogin("admin","pwd123");
        // System.out.println(vwoLogin1.password);
       vwoLogin1.setPassword("admin123",false);
       String pass= vwoLogin1.getPassword();
        System.out.println(pass);




    }
}
class VWOlogin{
    public String username;
    public String password;

    public VWOlogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
class GoodVWOLogin{
    private String username;
    private String password;
    //PC
    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean Isadmin) {
        this.password = password;
    }
}
