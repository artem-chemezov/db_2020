package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public Date convert(LocalDate date) {
        // todo finish this
        ZoneId defaultZoneId = ZoneId.systemDefault();
        return Date.from(date.atStartOfDay(defaultZoneId).toInstant());
    }

    public LocalDate convert(Date date) {
        // todo finish this
        ZoneId defaultZoneId = ZoneId.systemDefault();
        return date.toInstant().atZone(defaultZoneId).toLocalDate();
    }

        // 1981/02/30&18:20
    public static int daysBetween(String firstDate, String lastDate) {
        //JSR 310
        //todo finish this
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd&HH:mm");
        LocalDateTime first = LocalDateTime.parse(firstDate, dtf);
        LocalDateTime last = LocalDateTime.parse(lastDate, dtf);
        Duration diff = Duration.between(first, last);
        return Math.abs((int) diff.toDays());
    }



    public static void main(String[] args) {
        Main main = new Main();


        LocalDate nowLocal = LocalDate.now();
        Date now = new Date();

        System.out.println("local: " +  main.convert(nowLocal));
        System.out.println("date: " + main.convert(now));


        System.out.println(daysBetween("2001/02/27&19:25", "2001/03/01&18:20"));

//        LocalDateTime.of(1932,12,12,12,12,12)
/*        LocalDate now = LocalDate.now();
        LocalDate yest = now.minusDays(1);
        LocalDate date = now.withYear(2010);
        String displayName = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        System.out.println("displayName = " + displayName);

//        Duration
        long between = ChronoUnit.DAYS.between(date, now);
        System.out.println("between = " + between);*/

//
//        String str = "java";
//        str = str.toUpperCase();
//
//        Date date = new Date();
//        System.out.println("date = " + date.getYear());
    }
}
