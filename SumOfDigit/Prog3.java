import java.util.*;
// Using Recursion II
public class Prog3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int num = sc.nextInt();
        
        System.out.print("The Sum of digit : "+getSum(num));

    }

    static int getSum(int num) {

        if (num == 0) {
            
            return 0;

        }

        return ( num % 10 ) + getSum(num/10);

    }

}