package Mathematics;
import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        scanner.close();
        boolean ans = isPalindrome(num);
        if (ans)
            System.out.println("The number is Palindrome");
        else
            System.out.println("The Number is Not palindrome");

    }
}
