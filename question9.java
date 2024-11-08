import java.util.Scanner;

public class question9 {
    static boolean isNeonNumber(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }
        return n == sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isNeonNumber(n);
        if(b)
        {
            System.out.println("It is a neon number");
        }
        else
        {
            System.out.println("It is not a neon number");
        }
        sc.close();
    }
}