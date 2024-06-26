package Mathematics;
import java.util.Scanner;

public class Factorial {

    static long fact(int n) {
        /*
         1.Iterative Approach-Better Approach Since Less auxillary space is required here
         long res = 1, i;
         for (i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
        */

        // Recursive Approach
        if(n==0)
        return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        scanner.close();
        long ans = fact(num); 
        System.out.println("The factorial is : " + ans);

    }
}
