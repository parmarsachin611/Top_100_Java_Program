import java.util.*;
import java.lang.*;

public class Prog3 {

    public static void main(String args[]) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if(isEven(n)) {

            System.out.println("The Number is Even.");

        } else {

            System.out.println("The Number is Odd.");

        }

    }

    // Returns true if n is even, else odd
    static boolean isEven (Integer n)
    {
        // n & 1 is 1, then odd, else even
        return (!(n & 1));
    }

}