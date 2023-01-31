import java.util.*;

public class Prog1 {
    
    // Using Brute Force
    // Digit = 1234, Sum = 1+2+3+4
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Digit : ");
        int num = sc.nextInt();
        int sum = 0;

        while (num!=0) {
            
            sum += num % 10;
            num = num / 10;

        }

        System.out.print("The Sum of Digit : "+sum);

    }

}
