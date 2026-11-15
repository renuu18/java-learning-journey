public class ArrayMultiplication {
    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 20};
        int mul = 1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            mul = mul * arr[i];
        }

        System.out.println("The multiplication of elements is: " + mul);
    }
}