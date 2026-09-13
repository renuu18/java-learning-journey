import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        String day = scanner.nextLine();

        if (!day.equals("Monday")) {
            System.out.println("You have a class");
        } else {
            System.out.println("No class");
        }

        scanner.close();
    }
}
