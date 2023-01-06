import java.util.*;
import java.lang.*;

public class Prog3 {

    // This is Recursion Method

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("The Sum of "+n+" Natural Number is "+Sum(n));

    }

    static int Sum(int n) {

        if(n <= 1){
            return n;
        }

        return n + Sum( n - 1 );

    }

}