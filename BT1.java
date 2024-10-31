import java.util.Scanner;
public class BT1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ten,gioitinh,chuyen_nganh,quequan;
        int tuoi;
        float GPA;
        System.out.println("Nhap ten: ");ten=sc.nextLine();
        System.out.println("Nhap tuoi:");tuoi=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap gioi tinh: ");gioitinh=sc.nextLine();
        System.out.println("Nhap que quan: ");quequan=sc.nextLine();
        System.out.println("Nhap chuyen nganh: ");chuyen_nganh=sc.nextLine();
        sc.nextLine();
        System.out.println("Nhap diem GPA: ");GPA=sc.nextFloat();
        System.out.println("Thong tin sinh vien la: "+ten+","+tuoi +","+gioitinh+","+quequan+","+chuyen_nganh +","+GPA);
    }
    
}
