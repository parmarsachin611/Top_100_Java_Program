import java.util.*;

// Using Recursion I
public class Prog2 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int num = sc.nextInt();
        int sum = 0;
        System.out.print("Sum of Digit : "+ getSum(num,sum));

    }

    static int getSum( int num, int sum ) {

        if (num == 0) {
            return sum;
        }

        sum += num % 10;
        num = num / 10;
        return getSum(num, sum);

    }

}
