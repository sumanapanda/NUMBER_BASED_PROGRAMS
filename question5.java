import java.util.Scanner;

public class question5 {
    static boolean isDisariumNumber(int n) {
        int sum = 0, temp = n;
        int count = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count--);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isDisariumNumber(n);
        if(b)
        {
            System.out.println("It is a disari number");
        }
        else
        {
            System.out.println("It is not a disari number");
        }
        sc.close();
    }
}