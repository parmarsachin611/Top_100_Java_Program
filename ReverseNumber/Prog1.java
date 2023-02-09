import java.util.*;

public class Prog1 {

    // Using While Loop
    
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt(),reverse = 0, rem;

        while (num !=0) {
            
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;

        }

        System.out.print("The Reverse Number is "+reverse);

    }

}
