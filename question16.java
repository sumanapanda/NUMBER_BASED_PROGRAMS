import java.util.Scanner;

public class question16 {
    static boolean isBouncyNumber(int n) {
        String str = String.valueOf(n);
        boolean hasIncreasing = false, hasDecreasing = false;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) < str.charAt(i + 1)) 
                hasIncreasing = true;
            else if (str.charAt(i) > str.charAt(i + 1)) 
                hasDecreasing = true;
        }
        return hasIncreasing && hasDecreasing;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isBouncyNumber(n);
        if(b)
        {
            System.out.println("It is a bouncy number");
        }
        else
        {
            System.out.println("It is not a bouncy number");
        }
        sc.close();
    }
}