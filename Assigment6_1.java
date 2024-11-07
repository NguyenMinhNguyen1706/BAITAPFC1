import java.util.Scanner;
// 1, Find the Largest and Smallest Elements in an Array
//Input an integer array. Print the largest and smallest elements in the array.
public class Assigment6_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements for the array: ");int n=sc.nextInt();
        int []mang= new int[n];
        System.out.println("Enter the elements for the array: ");
        for(int i=0;i<n;i++){
            mang[i]=sc.nextInt();
        }
        int max= mang[0];
        int min= mang[0];
        for(int i=1;i<n;i++){
            if(mang[i]>max){
                max=mang[i];
            }
            if(mang[i]<min){
                min=mang[i];
            }
        }
        System.out.println("Largest element in the array is: " + max);
        System.out.println("Smallest element in the array is: " + min);
    }
    
}
