

import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class SinoTheWalker_01 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        String timeToString = scan.nextLine();
        DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(timeToString, parseFormat);
        int steps = Integer.parseInt(scan.nextLine()) % 86400;
        int secondsByEachStep = Integer.parseInt(scan.nextLine()) % 86400;
        int result = steps * secondsByEachStep;
        LocalTime newTime = time.plusSeconds(result);
        int h = newTime.getHour();
        int m = newTime.getMinute();
        int s = newTime.getSecond();
        if (h < 9 && m > 9 && s > 9) {
            System.out.printf("Time Arrival: 0%d:%d:%d", h, m, s);
        } else if (h > 9 && m < 9 && s > 9) {
            System.out.printf("Time Arrival: %d:0%d:%d", h, m, s);
        } else if (h > 9 && m > 9 && s < 9) {
            System.out.printf("Time Arrival: %d:%d:0%d", h, m, s);
        } else if (h < 9 && m < 9 && s < 9) {
            System.out.printf("Time Arrival: 0%d:0%d:0%d", h, m, s);
        } else if (h > 9 && m > 9 && s > 9) {
            System.out.printf("Time Arrival: %d:%d:%d", h, m, s);
        } else if (h < 9 && m < 9 && s > 9) {
            System.out.printf("Time Arrival: 0%d:0%d:%d", h, m, s);
        } else if (h < 9 && m > 9 && s < 9) {
            System.out.printf("Time Arrival: 0%d:%d:0%d", h, m, s);
        } else if (h > 9 && m < 9 && s < 9) {
            System.out.printf("Time Arrival: %d:0%d:0%d", h, m, s);
        }

    }
}
