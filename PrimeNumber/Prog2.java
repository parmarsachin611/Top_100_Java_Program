import java.util.*;

public class Prog2 {
    
    // Optimization by break condition
    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num < 2) {
            
            isPrime = false;

        } else {
            
            for (int i = 2; i < num; i++) {
                
                if (num % i == 0) {
                    
                    isPrime = false;
                    break;

                }

            }

        }

        String result = isPrime ? "prime" : "not prime";

        System.out.print(num+" is "+result+" number.");

    }

}
