
public class TwoSum {

    public static void twoSum(int[] arr, int k) {

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] + arr[j] == k) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,-5,-1,1};
        int k = 4;

        twoSum(arr, k);
    }
}
