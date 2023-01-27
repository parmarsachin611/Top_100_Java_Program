import java.util.*;

public class Prog4 {
    
    // Method Optimize by Square Root

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num < 2) {
            
            isPrime = false;

        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num%i == 0) {
                
                isPrime = false;
                break;

            }
            
        }

        String result = isPrime ? "Prime" : "not Prime";

        System.out.print("The Number "+num+" is: "+result);

    }

}
