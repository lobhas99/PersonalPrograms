package Mathematics;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

    public static void sieve(int num) {
        boolean[] prime = new boolean[num + 1];
        Arrays.fill(prime, true);
        for (int i = 2; i <= num; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= num; j += i) {
                    prime[j] = false;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        scanner.close();
        sieve(num);

    }

}
