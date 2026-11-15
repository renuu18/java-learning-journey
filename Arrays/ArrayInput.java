import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements:");

        for (int num : arr) {
            System.out.println(num);
        }

        sc.close();
    }
}