import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Sum of even and odd numbers from 1 to 100
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven = sumEven + i;
            } else {
                sumOdd = sumOdd + i;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);


        // 2. Print numbers from starting value to ending value
        System.out.println("\nEnter starting value:");
        int x = sc.nextInt();

        System.out.println("Enter ending point:");
        int y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }


        // 3. Print numbers in reverse
        System.out.println("\nReverse counting:");

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }


        // 4. Print A to Z
        System.out.println("\nA to Z:");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }


        // 5. Print Z to A
        System.out.println("\nZ to A:");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i);
        }


        // 6. Print characters with ASCII values
        System.out.println("\n\nCharacter and ASCII values:");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i + " -- " + (int) i);
        }


        // 7. Check even and odd numbers from 0 to 19
        System.out.println("\nEven and Odd numbers:");

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            } else {
                System.out.println("Odd number: " + i);
            }
        }


        // 8. Sum of digits
        int num = 98765;
        int sum = 0;

        for (; num > 0;) {
            int d = num % 10;
            sum = sum + d;
            num = num / 10;
        }

        System.out.println("\nSum of digits: " + sum);


        // 9. Sum of even digits
        int n = 1234;
        int evenDigitSum = 0;

        for (; n > 0; n = n / 10) {
            int d = n % 10;

            if (d % 2 == 0) {
                evenDigitSum = evenDigitSum + d;
            }
        }

        System.out.println("Sum of even digits: " + evenDigitSum);


        // 10. Check whether a number is prime
        System.out.println("\nEnter a number:");
        int primeNum = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= primeNum; i++) {
            if (primeNum % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(primeNum + " is a Prime Number");
        } else {
            System.out.println(primeNum + " is not a Prime Number");
        }


        // 11. Print all prime numbers from 1 to N
        System.out.println("\nEnter N:");
        int limit = sc.nextInt();

        System.out.println("Prime numbers:");

        for (int number = 2; number <= limit; number++) {

            int primeCount = 0;

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    primeCount++;
                }
            }

            if (primeCount == 2) {
                System.out.print(number + " ");
            }
        }


        // 12. Print multiples of 5
        System.out.println("\n\nEnter number:");
        int n1 = sc.nextInt();

        System.out.println("Multiples of 5:");

        for (int i = 5; i <= n1; i = i + 5) {
            System.out.print(i + " ");
        }


        // 13. Reverse a number
        int reverseNum = 12345;
        int reverse = 0;

        for (; reverseNum > 0; reverseNum = reverseNum / 10) {
            int d = reverseNum % 10;
            reverse = reverse * 10 + d;
        }

        System.out.println("\n\nReverse: " + reverse);


        // 14. Prime number and sum of digits
        int number = 13453;
        int divisorCount = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisorCount++;
            }
        }

        int temp = number;
        int digitSum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            digitSum = digitSum + digit;
            temp = temp / 10;
        }

        if (divisorCount == 2) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        System.out.println("Sum of digits = " + digitSum);


        // 15. Sum of prime digits
        int value = 13543;
        int primeDigitSum = 0;

        while (value != 0) {

            int rem = value % 10;
            boolean isPrime = true;

            if (rem < 2) {
                isPrime = false;
            }

            for (int i = 2; i <= rem / 2; i++) {

                if (rem % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeDigitSum = primeDigitSum + rem;
            }

            value = value / 10;
        }

        System.out.println("Sum of prime digits: " + primeDigitSum);

        sc.close();
    }
}
