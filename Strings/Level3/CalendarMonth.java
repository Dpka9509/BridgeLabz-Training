import java.util.Scanner;
import java.util.Calendar;

public class CalendarMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, 1); // month is 0-based

        int firstDay = cal.get(Calendar.DAY_OF_WEEK); // 1=Sunday, 7=Saturday
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("\nCalendar for " + month + "/" + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print leading spaces
        for (int i = 1; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
