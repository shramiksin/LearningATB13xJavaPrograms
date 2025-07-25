package ex_14_String;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sona";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        //  System.out.println(name.charAt(5)); // java.lang.StringIndexOutofBoundsException

        System.out.println(name.concat("Pat"));

        // 3. contains()
        System.out.println(name.contains("om"));

        //4. equals()
        System.out.println(name.equals("Sona"));

        //5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sona"));

        //6. indexOf() //sona->? 0
        System.out.println(name.indexOf('0'));

        String s1 ="madam";
        //Returns the index within this string of the
        // first occurence of the specified substring
        System.out.println(s1.indexOf('m'));

        System.out.println(s1.lastIndexOf('m'));

        // 7. length()
        System.out.println(name.length());

        //8. replace()
        System.out.println(name.replace('n','a'));

        //9. split()
        String name4="Par@live.com@123";
        String[] split_name4=name4.split("@");
        System.out.println(split_name4[0]);
        System.out.println(split_name4[1]);
        System.out.println(split_name4[2]);

        //11. substring(,)
        System.out.println(name.substring(1,3));

        //12. toLowerCase()
        System.out.println("SONA".toLowerCase());

        //13. toUpperCase()
        System.out.println("sona".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("S"));

        //15. endsWith()
        System.out.println(name.endsWith("a"));

        String anotherPalindrome = "Niagara. o roar again!";
        System.out.println(anotherPalindrome.length());

        String extract =anotherPalindrome.substring(11,15);
        System.out.println(extract);

        // concatenation(By +)
        String s111="Hello";
        String s222="World";

        String s333 = "ji";
        String result1= s111+s222+s333;
        System.out.println(result1);

        String n ="PRamoddUTTA";
        System.out.println(n.indexOf("d"));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));


}
}
