public class Pattern {

    public static void main(String[] args) {

        // 1. Diamond Pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (5 - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= 2 * (5 - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 2. Square Pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 3. Row Number Pattern
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(i + 1 + " ");
            }

            System.out.println();
        }


        // 4. Column Number Pattern
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(j + 1 + " ");
            }

            System.out.println();
        }


        // 5. Hollow Square Pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        // 6. Hollow Square using n
        int size = 10;

        for (int i = 1; i < size; i++) {

            for (int j = 1; j < size; j++) {

                if (i == 1 || i == size - 1 || j == 1 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        // 7. Right Triangle
        int n = 8;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // 8. Right-Aligned Triangle
        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
