public class Operators {

    public static void main(String[] args) {

        int i = 5;
        int j = 3;

        // Assignment Operator
        System.out.println("i = j : " + (i = j));

        // Compound Assignment Operators
        System.out.println("i += j : " + (i += j));
        System.out.println("i -= j : " + (i -= j));
        System.out.println("i *= j : " + (i *= j));
        System.out.println("i /= j : " + (i /= j));
        System.out.println("i %= j : " + (i %= j));
    }
}
