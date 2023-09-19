package display;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = getUserHour(scan);

        int minutes = getUserMinutes(scan);

        String timeText = outputString(hours, minutes);
        System.out.println(timeText);

        scan.close();

    }

    public static String outputString(int hours, int minutes) {
        String timeText;
        Hours newHour = new Hours(hours);
        Minutes newMinutes = new Minutes(minutes);
        if (hours == 12 && minutes == 0) {
            hours = 24;
            Hours newHour_noon = new Hours(hours);
            timeText = String.format("It is %s.", newHour_noon.getHoursName());
        } else if (hours == 0 && minutes == 0) {
            hours = 25;
            Hours newHour_midnight = new Hours(hours);
            timeText = String.format("It is %s.", newHour_midnight.getHoursName());

        } else if (minutes == 0) {
            timeText = String.format("It is %s o'clock.", newHour.getHoursName());
        } else if (minutes <= 30) {
            timeText = String.format("It is %s past %s.", newMinutes.getMinutesName(), newHour.getHoursName());
        } else {
            hours++;
            minutes = 60 - minutes;
            Hours newHour_to = new Hours(hours);
            Minutes newMinutes_to = new Minutes(minutes);
            timeText = String.format("It is %s to %s.", newMinutes_to.getMinutesName(), newHour_to.getHoursName());
        }
        return timeText;
    }

    public static int getUserMinutes(Scanner scan) {
        boolean validMinutes = false;
        int minutes = -1;
        while (!validMinutes) {
            System.out.println("Secondly, type the minutes: ");
            minutes = scan.nextInt();
            validMinutes = minutesValidator(minutes);

        }
        return minutes;
    }

    public static boolean minutesValidator(int minutes) {
        boolean validMinutes = false;
        if (minutes >= 0 && minutes < 60) {
            validMinutes = true;
        } else {
            System.out.println("Not valid number.");
        }
        return validMinutes;
    }

    public static int getUserHour(Scanner scanner) {
        boolean validHours = false;
        int hours = -1;
        while (!validHours) {
            System.out.println("Firstly, type the hours: ");
            hours = scanner.nextInt();
            validHours = hoursValidator(hours);
        }
        return hours;
    }

    public static boolean hoursValidator(int hours) {
        boolean validHours = false;
        if (hours >= 0 && hours < 24) {
            validHours = true;
        } else {
            System.out.println("Not valid number.");
        }
        return validHours;
    }
}
