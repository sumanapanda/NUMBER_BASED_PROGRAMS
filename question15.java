import java.util.Scanner;

public class question15 {
    static boolean isNivenNumber(int n) {
        return isHarshadNumber(n);
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isNivenNumber(n);
        if(b)
        {
            System.out.println("It is a niven number");
        }
        else
        {
            System.out.println("It is not a niven number");
        }
        sc.close();
    }
}