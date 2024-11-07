/*
    3, Count the Occurrences of an Element in the Array
    Input an integer array and a specific integer. Count and print the number of times that integer appears in the array.
*/
import java.util.Scanner;
public class Assignment6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements for the array: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        System.out.print("Enter the specific integer you want to count: ");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] == number) { 
                count++;
            }
        }
        if (count > 0) {
            System.out.println("The integer " + number + " appears " + count + " times in the array.");
        } else {
            System.out.println("The integer " + number + " does not exist in the array.");
        }
    }
}
