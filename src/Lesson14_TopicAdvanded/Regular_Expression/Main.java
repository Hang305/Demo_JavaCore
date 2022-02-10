package Lesson14_TopicAdvanded.Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    //Name: must be less than 6 characters and length is 12
    public static final String REGEX_NAME ="[a-zA-Z ]{6,12}$";

    //Email
    public static final String REGEX_EMAIL ="^\\w+@+\\w+(\\.\\w+){1,2}$";

    //Phone
    public static final String REGEX_PHONE_NUMBER ="^84\\d{7}$";

    public static void main(String[] args) {

        String input ="aba";
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher  matcher = pattern.matcher(input);
        System.out.println(matcher.matches());


        String email ="aba@aba.com.vn";
        Pattern pattern_email = Pattern.compile(REGEX_EMAIL);
        Matcher  matcher_email = pattern_email.matcher(email);
        System.out.println(matcher_email.matches());

        String phone ="849238";
        Pattern pattern_phone = Pattern.compile(REGEX_PHONE_NUMBER);
        Matcher  matcher_phone = pattern_phone.matcher(phone);
        System.out.println(matcher_phone.matches());
    }
}
