import java.util.Scanner;

public class question13 {
    static boolean HarshadMagicNumber(int n) {
        return isHarshadNumber(n) && isMagicNumber(n);
    }
    static boolean isHarshadNumber(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return n % sum == 0;
    }
    static boolean isMagicNumber(int num) {
        while (num >= 10) {
            int sumOfSquares = 0;
            while (num > 0) {
                int digit = num % 10;
                sumOfSquares += digit * digit;
                num /= 10;
            }
            num = sumOfSquares;
        }
        return (num == 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=HarshadMagicNumber(n);
        if(b)
        {
            System.out.println("It is a harshadmagic number");
        }
        else
        {
            System.out.println("It is not a harshadmagic number");
        }
        sc.close();
    }
}