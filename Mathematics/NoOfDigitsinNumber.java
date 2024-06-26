package Mathematics;
import java.util.Scanner;
public class NoOfDigitsinNumber{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        scanner.close();
        
        // 1.Iterative Solution
        
        int count=0;
         while(num!=0){
            num=num/10;
            count++;
         }      
         /*2.Recursive Solution
        if(num==0)
        return 0;
        return 1+



         */
        System.out.println("Number of digits in the number is "+count);
    }
}