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
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));

        System.out.println(fullname + " " + firstname);

        System.out.println("Le Thi Thanh \'Hang\'");
        System.out.println("Le Thi Thanh \tHang\'");
        System.out.println("Le Thi Thanh \bHang\'");
        System.out.println("Le Thi Thanh \nHang\'");

        System.out.println(fullname+firstname);
        //or
        System.out.println(fullname.concat(firstname));

        int x=10;
        int y=20;
        System.out.println(x+y);

        String a = "10";
        String b = "20";
        System.out.println(a+b);
    }
}
