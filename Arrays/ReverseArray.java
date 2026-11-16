
import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {1,3,2,4,5,6,4};

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverse(arr);
    }
}
