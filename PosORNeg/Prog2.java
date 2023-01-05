import java.util.*;

public class Prog2 {

    // This is Nested If-Else Method

    public static void main( String args[] ) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if( n >= 0 ) {

            if( n == 0 ) {

                System.out.println("The Number is Zero.");

            } else {

                System.out.println("The Number is Positive.");

            }

        } else {

            System.out.println("The Number is Negative.");

        }

    }

}
