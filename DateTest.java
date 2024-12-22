import java.util.Scanner;

class Date {
    // Instance variables
    private int month;
    private int day;
    private int year;

    // Constructor to initialize the date
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setters
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Method to display the date in MM/DD/YYYY format
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}

public class DateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values for month, day, and year
        System.out.println("Enter Month (1-12): ");
        int month = sc.nextInt();

        System.out.println("Enter Day (1-31): ");
        int day = sc.nextInt();

        System.out.println("Enter Year: ");
        int year = sc.nextInt();

        // Create a Date object
        Date date = new Date(month, day, year);

        // Display the initial date
        System.out.print("Initial Date: ");
        date.displayDate();

        // Modify the date using setters
        System.out.println("\nUpdating the date...");
        System.out.println("Enter new Month (1-12): ");
        date.setMonth(sc.nextInt());

        System.out.println("Enter new Day (1-31): ");
        date.setDay(sc.nextInt());

        System.out.println("Enter new Year: ");
        date.setYear(sc.nextInt());

        // Display the updated date
        System.out.print("Updated Date: ");
        date.displayDate();
    }
}
