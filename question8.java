import java.util.Scanner;

public class question8 {
    static boolean isAbundantNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) 
                sum += i;
        }
        return sum > n;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isAbundantNumber(n);
        if(b)
        {
            System.out.println("It is a abundant number");
        }
        else
        {
            System.out.println("It is not a abundant number");
        }
        sc.close();
    }
}