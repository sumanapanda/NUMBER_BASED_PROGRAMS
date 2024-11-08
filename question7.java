import java.util.Scanner;

public class question7 {
    static boolean isMagicNumber(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }
            num = sum;
        }
        return (num == 1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isMagicNumber(n);
        if(b)
        {
            System.out.println("It is a magic number");
        }
        else
        {
            System.out.println("It is not a magic number");
        }
        sc.close();
    }
}