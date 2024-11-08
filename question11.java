import java.util.Scanner;

public class question11 {
    static boolean isPronicNumber(int n) {
        int k = (int) Math.sqrt(n);
        return k * (k + 1) == n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isPronicNumber(n);
        if(b)
        {
            System.out.println("It is a pronic number");
        }
        else
        {
            System.out.println("It is not a pronic number");
        }
        sc.close();
    }
}