import java.util.Scanner;

public class question6 {
    static long TribonacciNumber(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        long a = 0, b = 1, c = 1, result = 0;
        for (int i = 3; i <= n; i++) {
            result = a + b + c;
            a = b;
            b = c;
            c = result;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        long b=TribonacciNumber(n);
        System.out.println("TribonacciNumber is: "+b);
        sc.close();
    }
}