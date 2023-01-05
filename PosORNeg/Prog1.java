import java.util.*;
public class Prog1 {
    // This is Brute Force Method
    public static void main( String args[] ){

        // Input From The User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        if ( n > 0 ) {

            System.out.println("The Number is Positive.");

        } else if( n < 0 ) {

            System.out.println("The Number is Negative.");

        } else {

            System.out.println("The Number is Zero.");

        }

    }

}