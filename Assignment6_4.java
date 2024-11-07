/*
    4, Sort the Array in Ascending Order
    Input an integer array. Write a program to sort this array in ascending order and print the result.
*/
import java.util.Scanner;
public class Assignment6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements for the array: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        System.out.println("Enter the elements for the array: ");
        for (int i = 0; i < n; i++) {
            mang[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(mang[j]>mang[j+1]){
                    int temp=mang[j];
                    mang[j]=mang[j+1];
                    mang[j+1]=temp;
                }
            }
        }
        System.out.println("Array after ascending sort is: ");
        for(int i=0;i<n;i++){
            System.out.println(mang[i]+" ");
        }
    }
}
