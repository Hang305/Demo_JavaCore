package Lesson1_variable;

public class _string {

    public static void main(String[] args) {

        String str ="Hello world";
        String fullname ="Le";
        String firstname ="Hang";

        //length
        System.out.println(str.length());
        //toUppercase
        System.out.println(str.toUpperCase());
        //to Lowercase
        System.out.println(str.toLowerCase());
        //Return index start of text
        System.out.println(str.indexOf("world"));
        System.out.println(fullname + " " + firstname);

        System.out.println("Le Thi Thanh \'Hang\'");
        System.out.println("Le Thi Thanh \tHang\'");
        System.out.println("Le Thi Thanh \bHang\'");
        System.out.println("Le Thi Thanh \nHang\'");
        System.out.println(fullname+firstname);

    }
}
