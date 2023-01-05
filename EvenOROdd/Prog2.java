import java.util.*;

public class Prog2 {

    // This is Ternary Method

    public static void main( String args[] ) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n = sc.nextInt();

        String result = n % 2 == 0 ? "The Number is Even." : "The Number is Odd.";

        System.out.println(result);

    }

}