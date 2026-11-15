public class ArrayMaximum {
    public static void main(String[] args) {

        int[] arr = {7, 35, 5, 7, 9, 11};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The maximum element is: " + max);
    }
}