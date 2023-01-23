import java.util.*;

// Using If-Else Method

public class Prog1{

    public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number 1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Number 2: ");
            int num2 = sc.nextInt();

            if (num1 == num2) {
                System.out.println("Both are equals!!!");
            } else if(num1 > num2) {
                System.out.println(num1+" is greatest!!!");
            } else {
                System.out.println(num2+" is greatest!!!");
            }

    }

}