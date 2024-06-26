package Mathematics;

import java.util.Scanner;

public class AllDivisorofNumber {

    static void allDivisor(int n) {
        int i;
        for ( i = 1; i * i < n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
        for (; i >=1; i--) {
            if (n % i == 0)
                System.out.print(n/i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        scanner.close();
        allDivisor(num);
    }
}
