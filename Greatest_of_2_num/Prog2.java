import java.util.*;

// Using Ternary Method

public class Prog2 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            
            System.out.println("Both are Equals!!!");

        } else {
            
            int temp = num1 > num2 ? num1 : num2 ;
            System.out.print(temp+" is greatest!!!");

        }

    }

}
