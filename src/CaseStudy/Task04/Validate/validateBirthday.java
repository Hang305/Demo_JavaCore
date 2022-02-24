package CaseStudy.Task04.Validate;

import javax.sound.midi.MidiFileFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class validateBirthday {

    long age;
    String dateOfBirth;
    String[] yearOfBirth;
    Date date = new Date();
    public static final String REGEX_DATE = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";
    Scanner scanner = new Scanner(System.in);

    public String validateBirthday(String birth) {
        Date today = new Date();
        long yearCurrent = today.getYear() + 1900;

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);

        while (!birth.matches(REGEX_DATE)) {
            System.out.println("Input invalid format dd/MM/yyyy. Please enter birthday again: ");
            dateOfBirth = scanner.nextLine();
        }


//        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        while (true) {
//            today = df.format(date);
//            df.setLenient(false);
//            df.format(birth);
//
//            LocalDate birthday = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//            LocalDate now = LocalDate.parse(today, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//            age = Period.between(now, birthday).getYears();
//            System.out.println(age);
//
//            if (age < 16 || age <= 0) {
//                System.out.println("Input invalid format dd/MM/yyyy and age must be greater than 16 years old. Please enter birthday again: ");
//                return dateOfBirth;
//            }
//            dateOfBirth = birth;
//            break;

        return dateOfBirth;
    }
}



