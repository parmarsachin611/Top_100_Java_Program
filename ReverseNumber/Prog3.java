import java.util.*;

public class Prog3 {
    
    // Using Recursion

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt(), rev = 0;

        System.out.print("The Reverse Number is "+getReverse(num,rev));

    }

    static int getReverse( int num, int rev ) {

        if (num == 0) {
            return rev;
        }

        int rem = num % 10;
        rev = rev * 10 + rem;

        return getReverse(num/10, rev);

    }
    
}
