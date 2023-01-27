import java.util.*;

public class Prog5 {
    
    // Optimization by skipping even iteration

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.print(num+" is Prime Number.");
        } else {
            System.out.print(num+" is not Prime Number.");
        }

    }

    static boolean isPrime(int n){
        
        if (n <= 1) {
            return false;
        } else if( n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i <=Math.sqrt(n); i+=2) {
            
            if (n%i==0) {

                return false;
                
            }

        }

        return true;
        
    }

}
