package timeobject10x;

import java.time.*;

public class Time1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Represents the current date
        LocalTime currentTime = LocalTime.now(); // Represents the current time
        LocalDateTime now = LocalDateTime.now(); // Represents current date and time
        ZonedDateTime nowInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo")); // Represents current date and time in Tokyo
        LocalDate specificDate = LocalDate.of(2024, 10, 20); // Specific date
        LocalDateTime meetingTime = LocalDateTime.of(2024, 11, 15, 13, 15, 30); // Specific date and time
        ZonedDateTime eventInNY = ZonedDateTime.of(2024, 12, 6, 19, 0, 0, 0, ZoneId.of("America/New_York")); // Specific date/time in New York
        OffsetDateTime webinarStart = OffsetDateTime.of(2024, 5, 15, 14, 0, 0, 0, ZoneOffset.ofHours(-7)); // Specific date/time and offset
        OffsetDateTime nowWithOffset = OffsetDateTime.now(ZoneOffset.UTC); // Current date/time with an offset
        OffsetTime flightDeparture = OffsetTime.of(11, 20, 0, 0, ZoneOffset.ofHoursMinutes(5, 30)); // Specific time and offset
        OffsetTime currentTimeWithOffset = OffsetTime.now(ZoneOffset.of("-08:00")); // Current time with an offset
        Instant transactionTimestamp = Instant.parse("2024-12-15T18:25:10.12345Z"); // Specific instant
        Instant now1 = Instant.now(); // The current instant
    }
}