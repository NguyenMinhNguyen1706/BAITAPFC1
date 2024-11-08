// Exercise 4: Number Pyramid
// Description: Write a program that generates a number pyramid of n rows. Each row should have increasing numbers from 1 up to the row number.
import java.util.Scanner;
public class Exercise4_NumberPyramid {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
