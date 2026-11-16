
import java.util.*;

public class Strings {

    // 1. Print each character of a string
    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    // 2. Count the length of a string
    public static int countLength(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        return count;
    }

    // 3. Reverse a string
    public static String reverse(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    // 4. Check whether a string is palindrome
    public static String palindrome(String str) {
        String rev = reverse(str);

        if (str.equals(rev)) {
            return "Palindrome";
        } else {
            return "Not Palindrome";
        }
    }

    // 5. Count vowels in a string
    public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Original String: " + str);
        System.out.println("Length: " + countLength(str));
        System.out.println("Reverse: " + reverse(str));
        System.out.println("Palindrome Check: " + palindrome(str));
        System.out.println("Number of Vowels: " + countVowels(str));

        // String methods
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trimmed String: " + str.trim());
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("Is Blank: " + str.isBlank());

        // Character array
        char[] characters = str.toCharArray();
        System.out.println("Character Array: " + Arrays.toString(characters));

        // Replace characters
        System.out.println("Replace a with m: " + str.replace('a', 'm'));

        // String comparison
        System.out.println("Equals: " + str.equals("Renu"));
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("Renu"));

        // StartsWith and EndsWith
        System.out.println("Starts With R: " + str.startsWith("R"));
        System.out.println("Ends With u: " + str.endsWith("u"));

        // Split string
        String names = "My,Name,Is,Renu";
        String[] arr = names.split(",");

        System.out.println("Split String:");
        for (String word : arr) {
            System.out.println(word);
        }

        // Substring and Contains
        System.out.println("Contains 'Renu': " + str.contains("Renu"));

        // Convert integer to string
        int num = 1234;
        String number = String.valueOf(num);

        System.out.println("Integer to String: " + number);
        System.out.println("String Concatenation: " + number + 1);

        sc.close();
    }
}
