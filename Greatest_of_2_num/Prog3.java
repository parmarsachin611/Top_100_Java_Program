import java.util.*;

// Using Inbuilt Method Max
public class Prog3 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();
        
        if (num1 == num2) {
            
            System.out.println("Both are equals!!!");

        } else {
            
            System.out.println(Math.max(num1, num2)+" is greatest!!!");

        }

    }

}
