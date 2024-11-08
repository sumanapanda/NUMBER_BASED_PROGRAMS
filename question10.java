import java.util.Scanner;

public class question10 {
    static boolean isArmstrongNumber(int n) {
        int sum = 0, temp = n;
        int count = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isArmstrongNumber(n);
        if(b)
        {
            System.out.println("It is a armstrong number");
        }
        else
        {
            System.out.println("It is not a armstrong number");
        }
        sc.close();
    }
}