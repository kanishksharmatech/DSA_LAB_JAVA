import java.util.Scanner;

public class Factorialn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
