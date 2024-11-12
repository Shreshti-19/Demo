
import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeFactorialException extends Exception {
    public NegativeFactorialException(String message) {
        super(message);
    }
}

public class FactorialCalculator {

    
    public static long calculateFactorial(int n) throws NegativeFactorialException {
        if (n < 0) {
            throw new NegativeFactorialException("Factorial not for negative");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            long factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is " + factorial);
        } catch (NegativeFactorialException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}

