package JavaNotes.CollectionsFramework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime1 {
    public static void main(String[] args) {

//        LocalDate d = LocalDate.now();
//        System.out.println(d);
//
//        LocalTime t = LocalTime.now();
//        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now(); //This is the date
        System.out.println(dt);

//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy , H:m a E"); //This is the format
//        String myDate = dt.format(df); //Creating date string using date and format
//        System.out.println(myDate);

        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE ;//This is the format
        String myDate = dt.format(df); //Creating date string using date and format
        System.out.println(myDate);
    }
}
