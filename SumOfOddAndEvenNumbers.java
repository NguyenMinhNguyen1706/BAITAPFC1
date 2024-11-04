import java.util.Scanner;

public class SumOfOddAndEvenNumbers {
    public static void sumEvenAndOdd(int n, int tong_chan, int tong_le) {
        tong_chan = 0;
        tong_le = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                tong_chan += i;
            } else {
                tong_le += i;
            }
        }

        System.out.println("Tong cac so chan tu 1 den n la: " + tong_chan);
        System.out.println("Tong cac so le tu 1 den n la: " + tong_le);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        int tong_chan = 0;
        int tong_le = 0;
        sumEvenAndOdd(n, tong_chan, tong_le);
    }
}
