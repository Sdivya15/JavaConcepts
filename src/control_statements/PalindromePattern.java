package control_statements;

public class PalindromePattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            // Increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}