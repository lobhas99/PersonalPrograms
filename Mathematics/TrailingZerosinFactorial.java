package Mathematics;

import java.util.Scanner;

public class TrailingZerosinFactorial {

    static int noOfZeros(int n) {

        int res = 0;
        for (int i = 5; i < n; i = i * 5) {
            res = res + n / i;
        }
        return res;

        /*
         * Normal Approach-This Approach will stop Working since there will be overflow.
         * long fact = 1, i;
         * for (i = 2; i <= n; i++) {
         * fact *= i;
         * }
         * int count = 0;
         * while (fact % 10 == 0) {
         * count++;
         * fact = fact / 10;
         * }
         * return count;
         */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        scanner.close();
        int ans = noOfZeros(num);
        System.out.println("The No Of Trailing Zeroes in Factorial is : " + ans);

    }
}
