public class While {

    public static void main(String[] args) {

        // 1. Count digits
        int n = 1815;
        int count = 0;

        while (n != 0) {
            count = count + 1;
            n = n / 10;
        }

        System.out.println("Number of digits: " + count);


        // 2. Sum of digits
        int a = 1815;
        int sum = 0;

        while (a != 0) {
            int d = a % 10;
            sum = sum + d;
            a = a / 10;
        }

        System.out.println("Sum of digits: " + sum);


        // 3. Reverse a number
        int b = 1815;
        int rev = 0;

        while (b != 0) {
            int d = b % 10;
            rev = rev * 10 + d;
            b = b / 10;
        }

        System.out.println("Reverse: " + rev);


        // 4. Palindrome number
        int palindromeNum = 6556;
        int original = palindromeNum;
        int palindromeReverse = 0;

        while (palindromeNum != 0) {
            int d = palindromeNum % 10;
            palindromeReverse = palindromeReverse * 10 + d;
            palindromeNum = palindromeNum / 10;
        }

        if (palindromeReverse == original) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


        // 5. Find maximum digit
        int maxNum = 59;
        int max = 0;

        while (maxNum != 0) {
            int d = maxNum % 10;

            if (d > max) {
                max = d;
            }

            maxNum = maxNum / 10;
        }

        System.out.println("Maximum digit: " + max);


        // 6. Find minimum digit
        int minNum = 59;
        int min = 9;

        while (minNum != 0) {
            int d = minNum % 10;

            if (d < min) {
                min = d;
            }

            minNum = minNum / 10;
        }

        System.out.println("Minimum digit: " + min);


        // 7. Armstrong number
        int armstrongNum = 181;
        int armstrongOriginal = armstrongNum;
        int armstrongSum = 0;

        while (armstrongNum != 0) {
            int d = armstrongNum % 10;
            armstrongSum = armstrongSum + (d * d * d);
            armstrongNum = armstrongNum / 10;
        }

        if (armstrongSum == armstrongOriginal) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong number");
        }


        // 8. Product of digits
        int productNum = 23;
        int product = 1;

        while (productNum != 0) {
            int d = productNum % 10;
            product = product * d;
            productNum = productNum / 10;
        }

        System.out.println("Product of digits: " + product);


        // 9. Count even and odd digits
        int evenOddNum = 543221;
        int evenCount = 0;
        int oddCount = 0;

        while (evenOddNum != 0) {
            int d = evenOddNum % 10;

            if (d % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }

            evenOddNum = evenOddNum / 10;
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);


        // 10. Perfect number
        int perfectNum = 6;
        int i = 1;
        int perfectSum = 0;

        while (i < perfectNum) {

            if (perfectNum % i == 0) {
                perfectSum = perfectSum + i;
            }

            i = i + 1;
        }

        if (perfectSum == perfectNum) {
            System.out.println("Perfect number");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}
