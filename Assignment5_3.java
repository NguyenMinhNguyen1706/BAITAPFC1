// Exercise 3: Multiplication Table
// Description: Write a program that generates and prints the multiplication table for a number up to 10.
import java.util.Scanner;
public class Exercise3_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");number=sc.nextInt();
        System.out.println("The multiplication table for a number is:");
        for(int i=1;i<=10;i++){
            System.out.println(number+"x"+i+"="+number*i);
        }
    }
    
}
