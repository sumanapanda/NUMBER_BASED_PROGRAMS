import java.util.*;
public class question1 {
    static boolean isSpyNumber(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return sum == product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isSpyNumber(n);
        if(b)
        {
            System.out.println("It is a spy number");
        }
        else
        {
            System.out.println("It is not a spy number");
        }
        sc.close();
    }   
}