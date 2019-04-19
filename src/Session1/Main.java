package Session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number = 0;
//        do {
//            System.out.println("So vua nhap: ");
//            number = scanner.nextInt();
//        } while (number % 2 != 0);
//        System.out.println("So nhap vao la:" + number);
            int n = scanner.nextInt();
            while (n % 2 == 0){
                System.out.println("nhap lai so khac:");
                n = scanner.nextInt();
            }
            System.out.println("So vua nhap:" +n);
    }
}
