public class ArrayInitialization {
    public static void main(String[] args) {
        int arr[];

        // Allocation
        arr = new int[5];

        // Initialization
        arr = new int[]{1, 2, 3, 4, 5};

        // Accessing elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}