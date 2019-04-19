package Session1;

import java.util.Scanner;

public class timSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int n = scanner.nextInt();
        int dem;
        while (n < 2) {
            System.out.println("Nhập lai số khac: ");
            n = scanner.nextInt();
        }
        for (int i = 2; i <= n; i++) {
            dem = 0;
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    dem++;
                }
            }
            if (dem == (i - 2)) {
                System.out.println("Cac so nguyen to la: " + i);
            }
        }
    }
}

