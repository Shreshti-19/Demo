import java.util.InputMismatchException;
import java.util.Scanner;
    
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class LCMHCFCalculator {

    
    public static int calculateHCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateHCF(num2, num1 % num2);
    }

    
    public static int calculateLCM(int num1, int num2) {
        return (num1 * num2) / calculateHCF(num1, num2);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            if (num2 < num1) {
                throw new InvalidInputException("Secondary number is smaller");
            }

            int hcf = calculateHCF(num1, num2);
            int lcm = calculateLCM(num1, num2);

            System.out.println("HCF: " + hcf);
            System.out.println("LCM: " + lcm);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}

