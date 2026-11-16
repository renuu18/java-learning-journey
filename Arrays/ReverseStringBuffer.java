
import java.util.Arrays;

public class ReverseStringBuffer {

    public static void reverse(StringBuffer[] arr) {

        // Reverse individual strings
        for(int i = 0; i < arr.length; i++) {
            arr[i].reverse();
        }

        // Reverse array order
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            StringBuffer temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        StringBuffer[] arr = {
            new StringBuffer("Rain"),
            new StringBuffer("Wind"),
            new StringBuffer("cool")
        };

        reverse(arr);
    }
}
