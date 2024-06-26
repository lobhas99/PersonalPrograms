package Mathematics;
import java.util.Scanner;

public class Prime {

    static boolean isPrime(int n) {
        if(n==1)
        return false;
        if(n==2 || n==3)
        return true;
        if(n%2==0 || n%3==0)
        return false;
        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        scanner.close();
        boolean ans = isPrime(num);
        if (ans)
            System.out.println("The number is Prime");
        else
            System.out.println("The Number is not Prime");

    }
}
