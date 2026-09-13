import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        foodMenu();
        calculator();
        dayName();
        weekdayWeekend();
        monthDays();
    }

    // 1. Food Menu
    static void foodMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select the option:");
        System.out.println("1. Dosa");
        System.out.println("2. Idly");
        System.out.println("3. Bonda");

        int option = sc.nextInt();

        switch (option) {
            case 1 -> System.out.println("Dosa");
            case 2 -> System.out.println("Idly");
            case 3 -> System.out.println("Bonda");
            default -> System.out.println("Item not found");
        }
    }

    // 2. Calculator
    static void calculator() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your option:");
        System.out.println("Addition");
        System.out.println("Subtraction");
        System.out.println("Multiplication");
        System.out.println("Division");

        String option = sc.next();

        System.out.println("Enter your values:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (option) {
            case "Addition" ->
                System.out.println("Addition is: " + (a + b));

            case "Subtraction" ->
                System.out.println("Subtraction is: " + (a - b));

            case "Multiplication" ->
                System.out.println("Multiplication is: " + (a * b));

            case "Division" ->
                System.out.println("Division is: " + (a / b));

            default ->
                System.out.println("Invalid input");
        }
    }

    // 3. Day Name
    static void dayName() {

        String day = "Tuesday";

        switch (day) {
            case "Monday" -> System.out.println("Monday");
            case "Tuesday" -> System.out.println("Tuesday");
            case "Wednesday" -> System.out.println("Wednesday");
            case "Thursday" -> System.out.println("Thursday");
            case "Friday" -> System.out.println("Friday");
            case "Saturday" -> System.out.println("Saturday");
            default -> System.out.println("Sunday");
        }
    }

    // 4. Weekday or Weekend
    static void weekdayWeekend() {

        String day = "Tuesday";

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("WEEKDAY");

            case "Saturday", "Sunday" ->
                System.out.println("Weekend");

            default ->
                System.out.println("Invalid");
        }
    }

    // 5. Days in Month
    static void monthDays() {

        int month = 5;

        switch (month) {
            case 0, 2, 4, 6, 7, 9, 11 ->
                System.out.println("31 days");

            case 3, 5, 8, 10 ->
                System.out.println("30 days");

            case 1 ->
                System.out.println("28 days");

            default ->
                System.out.println("Invalid");
        }
    }
}
