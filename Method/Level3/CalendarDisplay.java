import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month (non-leap year)
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the name of the month
    public static String getMonthName(int month) {
        return monthNames[month - 1];
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to get the first day of the month using Zeller's Congruence
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int q = 1; // Day of month
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        // h = 0 is Saturday, so adjust to make Sunday = 0
        return (h + 6) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDayOfMonth(month, year);

        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }

        // Print days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (MM): ");
        int month = scanner.nextInt();
        System.out.print("Enter year (YYYY): ");
        int year = scanner.nextInt();

        displayCalendar(month, year);
    }
}