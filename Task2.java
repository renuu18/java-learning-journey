import java.util.Scanner;

public class LoopsPractice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Factorial of a Number
        System.out.print("Enter a number for factorial: ");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);


        // 2. Neon Number
        int a = 9;
        int original = a;

        a = a * a;

        int sum = 0;

        while (a != 0) {
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }

        if (sum == original) {
            System.out.println("9 is a Neon number");
        } else {
            System.out.println("9 is not a Neon number");
        }


        // 3. Sum of Digits
        System.out.print("Enter a number for sum of digits: ");
        int num = sc.nextInt();

        int sum1 = 0;

        while (num != 0) {
            int digit = num % 10;
            sum1 = sum1 + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum1);

        sc.close();
    }
}
