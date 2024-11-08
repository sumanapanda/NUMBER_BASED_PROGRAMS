import java.util.Scanner;

public class question14 {
    static boolean isDudeneyNumber(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        int cubeRoot = (int) Math.cbrt(n);
        return sum == cubeRoot;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isDudeneyNumber(n);
        if(b)
        {
            System.out.println("It is a dudeney number");
        }
        else
        {
            System.out.println("It is not a dudeney number");
        }
        sc.close();
    }
}