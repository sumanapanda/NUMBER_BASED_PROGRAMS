import java.util.Scanner;

public class question2 {
    static boolean isDuckNumber(int n) {
        String str = String.valueOf(n);
        if (str.charAt(0) == '0') 
            return false;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '0') 
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        boolean b=isDuckNumber(n);
        if(b)
        {
            System.out.println("It is a duck number");
        }
        else
        {
            System.out.println("It is not a duck number");
        }
        sc.close();
    }
}