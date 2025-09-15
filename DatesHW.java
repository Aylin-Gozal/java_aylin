package DateClass;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.time.DayOfWeek;

public class DatesHW {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long msec = date.getTime();
        System.out.println(msec);

        String[] months = {"January", "February" , "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(months[calendar.get(Calendar.MONTH)]);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + " " + months[calendar.get(Calendar.MONTH)]);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + 10 + " " + months[calendar.get(Calendar.MONTH)]);
        calendar.set(2011, 4, 3);
        String[] daysOfweek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(daysOfweek[calendar.get(Calendar.DAY_OF_WEEK)]);

        LocalDate localDate = LocalDate.now();
        int current_day_of_year = localDate.getDayOfYear();
        LocalDate plus100 = localDate.plusDays(100);
        DayOfWeek dayOfWeekPlus100 = plus100.getDayOfWeek();

        System.out.println(current_day_of_year);
        System.out.println(plus100.getDayOfYear());
        System.out.println(dayOfWeekPlus100);



        LocalDate december = LocalDate.of(2025, 12, 31);
        System.out.println(december.getDayOfWeek());
        System.out.println(december.getDayOfYear());



    }
}
