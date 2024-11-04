// Viet ham tim so nguyen ti (Prime Number) tu 1 den 100
import java.util.Scanner;
public class timsonttu1den100 {
    public static boolean kiemtra_snt(int n){
        if(n<2){
		return false;
	}
	for(int i=2;i<=Math.sqrt(n);i++){
		if(n%i==0){
			return false;
		}
	}
	return true;
    }
    public static void in(int n){
        System.out.println("Cac so nguyen to tu 1 den n la: ");
        for(int i=1;i<=n;i++){
            if(kiemtra_snt(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n= ");n=sc.nextInt();
        in(n);
    }
    
}
