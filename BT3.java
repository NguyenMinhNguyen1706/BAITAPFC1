import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot ky tu: ");
        boolean ketqua;

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            ketqua = true;
            System.out.println("Ket qua kiem tra xem ky tu do co phai la so nguyen khong la: " + ketqua);
        } else {
            ketqua = false;
            System.out.println("Ket qua kiem tra xem ky tu do co phai la so nguyen khong la: " + ketqua);
        }
    }
}
