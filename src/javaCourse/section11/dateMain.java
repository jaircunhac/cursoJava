package javaCourse.section11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dateMain {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // INSTANCING

        // Date, Month and Year
        System.out.println(today);

        LocalDateTime today2 = LocalDateTime.now();

        // Milliseconds, Seconds, Minutes, Hours, Date, Month and Year
        System.out.println(today2);

        Instant today3 = Instant.now();

        // Milliseconds, Seconds, Minutes, Hours, Date, Month and Year (With the timezone)
        System.out.println(today3);

        System.out.println("----------------------------------------");

        // Setting manually the time
        LocalDate data = LocalDate.parse("2025-07-01");
        LocalDateTime data2 = LocalDateTime.parse("2025-07-01T08:26:50");
        Instant data3 = Instant.parse("2025-07-01T08:26:50Z");

        System.out.println(data);
        System.out.println(data2);
        System.out.println(data3);

        // Setting the time manually that will show the London time based on São Paulo time
        Instant SpParaLondres = Instant.parse("2025-07-01T08:26:50-03:00");
        System.out.println(SpParaLondres);

        System.out.println("----------------------------------------");

        // Formating time
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data4 = LocalDate.parse("07/07/2025", format);
        LocalDateTime data5 = LocalDateTime.parse("07/07/2025 07:38", format2);

        LocalDate data6 = LocalDate.of(2025, 7, 7);
        LocalDateTime data7 = LocalDateTime.of(2025, 7, 7, 7, 42);

        System.out.println("Data = " + data4.toString());
        System.out.println("Data = " + data5.toString());
        System.out.println("Data = " + data6.toString());
        System.out.println("Data = " + data7.toString());

        System.out.println("----------------------------------------");

        // FORMATING

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("Data06 (Formated) = " + data6.format(fmt1));
        System.out.println("Data03 (Formated) = " + fmt3.format(data3));
//        System.out.println("Data03 (Formated) = " + fmt2.format(data3)); It will show exception error, because this format type does not specify the timezone.

        System.out.println("----------------------------------------");

        System.out.println("Data07 (Formated) = " + data7.format(fmt1));
        System.out.println("Data07 (Formated) = " + data7.format(fmt2));
        System.out.println("Data07 (Formated) = " + data7.format(fmt4));

        System.out.println("----------------------------------------");

        System.out.println("Data06 (Formated) = " + data6.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("----------------------------------------");

        // CONVERTING

        // data3 = com timezone / data4 = dia, mês e ano / data7 = dia, mês, ano, hora e minute

        // There are more than 500 values in here, don't use it. But essentially it gives you all the timezones that the ZoneId haves.
//        for (String element : ZoneId.getAvailableZoneIds()){
//            System.out.println(element);
//        }

        LocalDate r1 = LocalDate.ofInstant(data3, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(data3, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(data3, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(data3, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("data4 dia = " + data4.getDayOfMonth());
        System.out.println("data4 mês = " + data4.getMonth());
        System.out.println("data4 ano = " + data4.getYear());

        System.out.println("data7 hora = " + data7.getHour());
        System.out.println("data7 minute = " + data7.getMinute());

        System.out.println("----------------------------------------");

        // CALCULATING

        LocalDate pastWeekLocalDate = data4.minusWeeks(1);
        LocalDate nextWeekLocalDate = data4.plusWeeks(1);

        System.out.println("Past week = " + pastWeekLocalDate);
        System.out.println("Next week = " + nextWeekLocalDate);
    }
}
