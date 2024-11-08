import java.util.Scanner;

public class question4 {
    static boolean isBuzzNumber(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isBuzzNumber(n);
        if(b)
        {
            System.out.println("It is a buzz number");
        }
        else
        {
            System.out.println("It is not a buzz number");
        }
        sc.close();
    }
}