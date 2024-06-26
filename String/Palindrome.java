package String;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(String s) {
        int i, j;
        i = 0;
        j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = scanner.next();
        scanner.close();
        boolean ans = isPalindrome(s);
        if (ans)
            System.out.println("The String is Palindrome");
        else
            System.out.println("The String is Not palindrome");

    }
}
