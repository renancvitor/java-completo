package Program;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Application {
    public static void main(String[] args) {



        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-07-01");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-01T07:13:37");
        Instant d06 = Instant.parse("2024-07-01T07:13:37Z");
        Instant d07 = Instant.parse("2024-07-01T07:13:37-03:00");

        LocalDate d08 = LocalDate.parse("01/07/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("01/07/2024 07:13", fmt2);

        LocalDate d10 = LocalDate.of(2024, 7, 01);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 01, 7, 13);

        System.out.println("d01 =  " + d01.toString());
        System.out.println("d02 =  " + d02.toString());
        System.out.println("d03 =  " + d03.toString());
        System.out.println("d04 =  " + d04.toString());
        System.out.println("d05 =  " + d05.toString());
        System.out.println("d06 =  " + d06.toString());
        System.out.println("d07 =  " + d07.toString());
        System.out.println("d08 =  " + d08.toString());
        System.out.println("d09 =  " + d09.toString());
        System.out.println("d10 =  " + d10.toString());
        System.out.println("d11 =  " + d11.toString());


        System.out.println("\nd04:  " + d04.format(fmt1));
        System.out.println("d04:  " + fmt1.format(d04));
        System.out.println("d04:  " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05:  " + d05.format(fmt1));
        System.out.println("d05:  " + d05.format(fmt2));

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d06:  " + fmt3.format(d06));


        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("\nr1:  " + r1);
        System.out.println("r2:  " + r2);
        System.out.println("r2:  " + r3);
        System.out.println("r2:  " + r4);

        System.out.println("d04 dia:  " + d04.getDayOfMonth());
        System.out.println("d04 mês:  " + d04.getMonthValue());
        System.out.println("d04 mês:  " + d04.getYear());

        System.out.println("d05 hora:  " + d05.getHour());
        System.out.println("d05 hora:  " + d05.getMinute());
        System.out.println("d05 hora:  " + d05.getSecond());


        LocalDate pastweekLocalDate = d04.minusDays(7);
        LocalDate nextweekLocalDate = d04.plusDays(7);

        System.out.println("\nPast week Local Date:  " + pastweekLocalDate);
        System.out.println("Next week Local Date:  " + nextweekLocalDate);

        LocalDateTime pastweekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextweekLocalDateTime = d05.plusDays(7);

        System.out.println("Past week Local Date Time:  " + pastweekLocalDateTime);
        System.out.println("Next week Local Date Time:  " + nextweekLocalDateTime);

        Instant pastweekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextweekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("Past week Local Date Time:  " + pastweekInstant);
        System.out.println("Next week Local Date Time:  " + nextweekInstant);

        Duration t1 = Duration.between(pastweekLocalDate.atStartOfDay(), d04.atTime(0, 0));
        Duration t2 = Duration.between(pastweekLocalDateTime, d05);
        Duration t3 = Duration.between(pastweekInstant, d06);
        Duration t4 = Duration.between(d06, pastweekInstant);

        System.out.println("t1 dias:  " + t1.toDays());
        System.out.println("t2 dias:  " + t2.toDays());
        System.out.println("t3 dias:  " + t3.toDays());
        System.out.println("t4 dias:  " + t4.toDays());

    }
}
