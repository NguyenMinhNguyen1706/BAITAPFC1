
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BTNANGCAO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ten, gioitinh, chuyen_nganh, quequan;
        int tuoi;
        float GPA;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Nhap nam sinh (dd/MM/yyyy): ");
            String namsinhStr = sc.nextLine();
            Date namsinh = formatter.parse(namsinhStr);

            System.out.println("Nhap ten: ");
            ten = sc.nextLine();

            System.out.println("Nhap tuoi: ");
            tuoi = sc.nextInt();
            sc.nextLine(); 

            System.out.println("Nhap gioi tinh: ");
            gioitinh = sc.nextLine();

            System.out.println("Nhap que quan: ");
            quequan = sc.nextLine();

            System.out.println("Nhap chuyen nganh: ");
            chuyen_nganh = sc.nextLine();

            System.out.println("Nhap diem GPA: ");
            GPA = sc.nextFloat();

            System.out.println("Thong tin sinh vien la: "
                    + ten + ", "
                    + tuoi + ", "
                    + gioitinh + ", "
                    + quequan + ", "
                    + chuyen_nganh + ", "
                    + GPA + ", "
                    + formatter.format(namsinh));
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang. Vui long nhap ngay theo dinh dang dd/MM/yyyy.");
        }
    }
}
