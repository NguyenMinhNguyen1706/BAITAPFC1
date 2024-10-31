import java.util.Scanner;
public class BT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap vao mot chuoi: ");
        boolean ketqua = false;

        if (sc.hasNext()) {
            String kytu = sc.next();
            ketqua = kytu.length() > 1;
            System.out.println("Ket qua kiem tra la: " + ketqua);
        }
    }
}
