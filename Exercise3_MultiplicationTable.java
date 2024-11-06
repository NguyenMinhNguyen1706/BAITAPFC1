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
