import java.util.Scanner;
public class PTBAC1 {
    public static void main(String[] args) {
        // Phuong trinh bac 1: ax+b=0;
        Scanner sc= new Scanner(System.in);
        float a,b,x;
        System.out.println("Nhap he so a: ");a=sc.nextFloat();
        System.out.println("Nhap he so b: ");b=sc.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem.");
            }else{
                System.out.println("Phuong trinh vo nghiem!");
            }
        }else{
            x=-b/a;
            System.out.println("Phuong trinh co nghiem x= "+x);
        }
    }
}
