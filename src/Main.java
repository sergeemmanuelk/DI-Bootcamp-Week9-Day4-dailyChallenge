import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Print the current date using LocalDate
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Print the current time using LocalDate
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current Time: " + currentTime.toLocalTime());

        // Print the current time and date using LocalDateTime
        System.out.println("Current Date and Time: " + currentTime);

        // Print in a particular format "dd-MM-yyyy HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted Date and Time: " + currentTime.format(formatter));

        // Print months days and seconds
        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();
        System.out.println("Month: " + month + " Day: " + day + " Seconds: " + seconds);

        // Print some specified date "1950,1,26"
        LocalDate date = LocalDate.of(1950, Month.JANUARY, 26);
        System.out.println("Specified Date: " + date);

        // Print date with current time
        LocalDateTime dateTimeWithCurrentTime = date.atTime(currentTime.toLocalTime());
        System.out.println("Date with Current Time: " + dateTimeWithCurrentTime);
    }
}