package String;

import java.util.Scanner;

public class Subsequence {


    public static boolean isSubsequence(String s1,String s2 ){
        int i=0,j=0;
        for( i=0;i<s1.length() && j<s2.length();i++){
            if(s1.charAt(i)==s2.charAt(j))
            {
                j++;
            }
        }
        return (j==s2.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = scanner.next();
        String s2=scanner.next();
        scanner.close();
        boolean ans = isSubsequence(s1,s2);
        if (ans)
            System.out.println("The String is a subsequence");
        else
            System.out.println("The String is Not a subsequence");

    }
    
}
