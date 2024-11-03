import java.util.Scanner;
public class PTBAC2 {
    public static void main(String[] args) {
        // Phuong trinh bac 2: ax2+bx+c=0
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap he so a = ");a=sc.nextDouble();
        System.out.println("Nhap he so b = ");b=sc.nextDouble();
        System.out.println("Nhap c = ");c=sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo nghiem.");
            }else{
                System.out.println("Phuong trinh co mot nghiem x= "+(-c/b));
            }
        }
        double delta=b*b-4*a*c;
        if(delta>0){
            double x1= (-b+Math.sqrt(delta)/(2*a));
            double x2= (-b-Math.sqrt(delta)/(2*a));
            System.out.println("Phuong trinh co hai nghiem phan biet la: x1 = "+x1+"va x2 = "+x2);
        }else if(delta==0){
            double x=-b/(2*a);
            System.out.println("Phuong trinh co nghiem kep la:x1=x2=x=  "+x);
        }else{
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
    
}
