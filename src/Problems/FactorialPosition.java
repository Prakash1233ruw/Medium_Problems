package Problems;

public class FactorialPosition {

    public static void main(String[] args) {

        int a[] = {61, 8, 24, 6, 7, 120, 10};
        int input = 4;

        int index = 0;
        int n = findFactorial(input);

        boolean factFound = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == n) {
                index = i;
                factFound = true;
                break;
            }
        }

        if (factFound) {
            System.out.println(index);
        } else {
            System.out.println("Factorial of the number is not presented");
        }
    }

    private static int findFactorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }
}