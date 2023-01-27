import java.util.*;

public class Prog1 {

    // Method 1: Simple iterative solution
    
    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        checkPrime(num);

    }

    private static void checkPrime(int n) {

        int count = 0;

        // If N is 0 or 1
        if ( n < 2 ) {
            
            System.out.print(n+" is not prime number");

        }

        // Check the number of divisors b/w [1, n]
        for (int i = 1; i < n; i++) {
            
            if ( n % i == 0) {
                count++;
            }

        }

        if (count > 2) {

            System.out.print(n+" is not prime number");
            
        } else {

            System.out.print(n+" is prime number");
            
        }


    }

}
