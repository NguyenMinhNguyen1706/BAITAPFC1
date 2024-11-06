import java.util.Scanner;

public class Exercise2_FibonacciSequence { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci sequence: ");
        int numberOfTermsInFibo = sc.nextInt();
        int firstNumber = 0, secondNumber = 1;
        
        System.out.print("Fibonacci Sequence: " + firstNumber + " " + secondNumber + " ");
        
        // Generate Fibonacci sequence up to the specified number of terms
        for (int i = 3; i <= numberOfTermsInFibo; i++) { 
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        
        sc.close();
    }
}
