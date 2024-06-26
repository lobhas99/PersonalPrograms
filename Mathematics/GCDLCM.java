package Mathematics;
import java.util.Scanner;

public class GCDLCM {

    static int gcd(int a, int b) {
        // while (a!=b) {
        //     if(a>b)
        //     a=a-b;
        //     else
        //     b=b-a;
        // }
        // return a;

        if(b==0)
        return a;
        else 
        return gcd(b, a%b);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the Second number");
        int b = scanner.nextInt();
        scanner.close();
        int Gcd = gcd(a, b);
        int lcm=lcm(a, b);
        System.out.println("The GCD is : " + Gcd + " The LCM is : " + lcm);

    }

}
