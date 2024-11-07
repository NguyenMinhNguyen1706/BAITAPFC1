import java.util.Scanner;
public class Assignment6_2 {
    public static void main(String[] args) {
        //2. Calculate the Sum and Average of Array Elements
        //Input an integer array. Calculate and print the sum and average of the elements in the array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for the array: ");int n=sc.nextInt();
        int []mang = new int[n];
        System.out.println("Enter the elements for the array: ");
        int sum=0;
        float average=0;
        for(int i=0;i<n;i++){
            mang[i]=sc.nextInt();
            sum+=mang[i];
            average=sum/n;
        }
        System.out.println("Sum of the elements in the array is: "+sum);
        System.out.println("Average of the elements in the array is: "+average);
        
    }
    
}
