import java.util.*;

public class Prog3 {

    // This is Ternary Operator

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if( n == 0) {

            System.out.println("The Number is Zero.");

        } else {

            String result = n > 0 ? "The Number is Positive." : "The Number is Negative.";
            System.out.println(result);

        }

    }    

}