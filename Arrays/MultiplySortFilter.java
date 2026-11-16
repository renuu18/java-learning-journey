
import java.util.Arrays;

public class MultiplySortFilter {

    public static void main(String[] args) {

        int[] arr = {1,5,10,5,10,3,4,5};

        // Step 1: Multiply by 2
        for(int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        System.out.println("After Multiplication: "
                + Arrays.toString(arr));

        // Step 2: Descending order
        for(int j = 0; j < arr.length; j++) {

            for(int k = j + 1; k < arr.length; k++) {

                if(arr[j] < arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                }
            }
        }

        System.out.println("Descending Order: "
                + Arrays.toString(arr));

        // Step 3: Filter elements divisible by 5
        int[] filtered = new int[arr.length];
        int count = 0;

        for(int l = 0; l < arr.length; l++) {

            if(arr[l] % 5 == 0) {
                filtered[count] = arr[l];
                count++;
            }
        }

        System.out.println("Filtered Elements: "
                + Arrays.toString(Arrays.copyOf(filtered, count)));
    }
}
