import java.util.*;

// Using ACSII Table

public class Prog4 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        String num = sc.next();

        System.out.print("The Sum of Digit : " + getSum(num));

    }

    static int getSum(String num) {

        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            
            sum = sum + num.charAt(i) - 48 ;

        }

        return sum;

    }
    
}
