package CaseStudy.Task04.Validate;

import javax.sound.midi.MidiFileFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class validateBirthday {

    int age;
    String dateOfBirth, today;
    Date date = new Date();

    public String validateBirthday(String birth) {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        while (true) {
            today = df.format(date);
            df.setLenient(false);
            df.format(birth);

            LocalDate birthday = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate now = LocalDate.parse(today, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            age = Period.between(now, birthday).getYears();

            if (age < 16 || age <= 0) {
                System.out.println("Input invalid format dd/MM/yyyy and age must be greater than 16 years old. Please enter birthday again: ");
                return dateOfBirth;
            }
            dateOfBirth = birth;
            break;
        }
        return dateOfBirth;
    }

}
