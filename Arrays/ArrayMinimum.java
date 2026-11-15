public class ArrayMinimum {
    public static void main(String[] args) {

        int[] arr = {7, 35, 5, 7, 9, 11};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The minimum element is: " + min);
    }
}