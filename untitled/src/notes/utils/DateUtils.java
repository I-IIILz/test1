package notes.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtils {

    private static final DateTimeFormatter FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static boolean isValidDateTime(String dateTime) {
        try {
            LocalDateTime.parse(dateTime, FORMAT);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}