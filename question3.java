import java.util.Scanner;

public class question3 {
    static boolean isTechNumber(int n) {
        String str = String.valueOf(n);
        if (str.length() % 2 != 0) 
            return false;
        
        int halfLength = str.length() / 2;
        int firstHalf = Integer.parseInt(str.substring(0, halfLength));
        int secondHalf = Integer.parseInt(str.substring(halfLength));
        int sum = (firstHalf + secondHalf) * (firstHalf + secondHalf);

        return sum == n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isTechNumber(n);
        if(b)
        {
            System.out.println("It is a tech number");
        }
        else
        {
            System.out.println("It is not a tech number");
        }
        sc.close();
    }
}