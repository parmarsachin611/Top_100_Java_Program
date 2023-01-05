import java.util.*;

public class Prog1 {

    // This is the For Loop Method

    public static void main ( String args[] ) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int sum = 0;

        for( int i = 1; i<=n ; i++ ) {

            sum += i;

        }

        System.out.println("The Sum of "+n+" Natural Number is "+sum+".");

    }

}