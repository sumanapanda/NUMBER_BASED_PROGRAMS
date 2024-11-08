import java.util.Scanner;

public class question12 {
    static boolean isHarshadNumber(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        return n % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isHarshadNumber(n);
        if(b)
        {
            System.out.println("It is a harshad number");
        }
        else
        {
            System.out.println("It is not a harshad number");
        }
        sc.close();
    }
}