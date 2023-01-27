import java.util.*;

public class Prog6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        int num = sc.nextInt();
        int i = 2;

        boolean isPrime = true;
        
        isPrime = checkPrime(num,i);

        String result = isPrime ? "Prime" : "not Prime";

        System.out.print(num+" is "+result);

    }

    static Boolean checkPrime(int n, int i){

        if (n < 2) {
            return false;
        } else if ( i == n ) {
            return true;
        } else if (n%i==0) {
            return false;
        }

        i += 1;
        return checkPrime(n, i);

    }

}
