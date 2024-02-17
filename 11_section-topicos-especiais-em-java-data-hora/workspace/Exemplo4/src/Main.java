import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate nextYearLocalDate = d04.plusYears(1);

        System.out.println("d04 = " + d04);
        System.out.println("d04 - pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("d04 - nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("d04 - nextYearLocalDate = " + nextYearLocalDate);
        System.out.println();

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        LocalDateTime nextYearLocalDateTime = d05.plusYears(1);

        System.out.println("d05 = " + d05);
        System.out.println("d05 - pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("d05 - nextWeekLocalDateTime = " + nextWeekLocalDateTime);
        System.out.println("d05 - nextYearLocalDateTime = " + nextYearLocalDateTime);
        System.out.println();

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("d06 = " + d06);
        System.out.println("d06 - pastWeekInstant = " + pastWeekInstant);
        System.out.println("d06 - nextWeekInstant = " + nextWeekInstant);
        System.out.println();

//        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}