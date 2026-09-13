public class Ternary {

    public static void main(String[] args) {

        // 1. Electricity Bill Calculation
        int units = 350;

        int bill =
                units <= 100 ? units * 2
                : units <= 200 ? (100 * 2) + ((units - 100) * 3)
                : units <= 300 ? (100 * 2) + (100 * 3) + ((units - 200) * 5)
                : (100 * 2) + (100 * 3) + (100 * 5) + ((units - 300) * 7);

        System.out.println("Bill = ₹" + bill);


        // 2. Find Greatest Among Three Numbers
        int a = 25;
        int b = 25;
        int c = 15;

        String greatest =
                (a >= b && a >= c) && (b >= a && b >= c)
                        ? "A and B are greatest"
                        : (a >= b && a >= c) && (c >= a && c >= b)
                                ? "A and C are greatest"
                                : (b >= a && b >= c) && (c >= a && c >= b)
                                        ? "B and C are greatest"
                                        : "All are equal";

        System.out.println(greatest);


        // 3. Find Second Greatest Among Three Numbers
        int x = 45;
        int y = 20;
        int z = 35;

        String secondGreatest =
                (x > y && x < z) || (x < y && x > z)
                        ? "45 is second greatest"
                        : (y < x && y > z) || (y > x && y < z)
                                ? "20 is second greatest"
                                : "35 is second greatest";

        System.out.println(secondGreatest);


        // 4. Check Positive/Negative and Even/Odd
        int num = -27;

        String numberType =
                num == 0 ? "Zero"
                : num > 0 && num % 2 == 0 ? "Positive Even"
                : num > 0 && num % 2 != 0 ? "Positive Odd"
                : num < 0 && num % 2 == 0 ? "Negative Even"
                : "Negative Odd";

        System.out.println(numberType);


        // 5. Check Divisibility by 2, 3 and 5
        int n = 60;

        String division =
                (n % 2 == 0 && n % 3 == 0 && n % 5 == 0)
                        ? "Divisible by 2, 3 and 5"
                        : (n % 2 == 0 && n % 3 == 0)
                                ? "Divisible by 2 and 3"
                                : (n % 2 == 0 && n % 5 == 0)
                                        ? "Divisible by 2 and 5"
                                        : (n % 3 == 0 && n % 5 == 0)
                                                ? "Divisible by 3 and 5"
                                                : (n % 2 == 0)
                                                        ? "Divisible only by 2"
                                                        : (n % 3 == 0)
                                                                ? "Divisible only by 3"
                                                                : (n % 5 == 0)
                                                                        ? "Divisible only by 5"
                                                                        : "Not divisible by 2, 3 or 5";

        System.out.println(division);


        // 6. Check Type of Triangle
        int i = 5;
        int j = 5;
        int k = 8;

        String triangle =
                !(i + j > k && i + k > j && j + k > i)
                        ? "Invalid Triangle"
                        : i == j && j == k
                                ? "Equilateral"
                                : i == j || i == k || j == k
                                        ? "Isosceles"
                                        : "Scalene";

        System.out.println(triangle);


        // 7. Validate a Date
        int month = 2;
        int year = 2024;
        int day = 29;

        boolean leap =
                year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        String date =
                month < 1 || month > 12
                        ? "Invalid Month"
                        : day < 1
                                ? "Invalid Day"
                                : month == 2
                                        ? day <= (leap ? 29 : 28)
                                                ? "Valid Date"
                                                : "Invalid Date"
                                        : (month == 4 || month == 6 || month == 9 || month == 11)
                                                ? day <= 30
                                                        ? "Valid Date"
                                                        : "Invalid Date"
                                                : day <= 31
                                                        ? "Valid Date"
                                                        : "Invalid Date";

        System.out.println(date);


        // 8. Bank Withdrawal
        int balance = 10000;
        int amount = 3500;
        boolean cardValid = true;

        String bank =
                !cardValid
                        ? "Invalid card"
                        : amount <= 0
                                ? "Invalid amount"
                                : amount > balance
                                        ? "Insufficient balance"
                                        : "Withdrawal successful. Remaining balance: "
                                                + (balance - amount);

        System.out.println(bank);
    }
}
