package JavaNotes.CollectionsFramework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class PracticeSet {
    public static void main(String[] args) {
        //PS 1
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        for (String e : ar){
            System.out.println(e);
        }

        //PS 2
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //PS 3
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));

       //PS 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myTime = df.format(dt);
        System.out.println(myTime);

        //PS 5
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(34);
        set.add(9);
        set.add(6);
        System.out.println(set);
    }
}
