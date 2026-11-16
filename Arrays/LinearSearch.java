
public class LinearSearch {

    public static String searching(int[] arr, int k) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == k) {
                System.out.println("Element found at index: " + i);
                return "Found";
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        int[] arr = {2,6,5,1,4};
        int k = 7;

        System.out.println(searching(arr, k));
    }
}
