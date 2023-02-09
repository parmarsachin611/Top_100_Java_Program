import java.util.Scanner;

public class Prog2 {
    
    // Using For Loop

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt(), reverse = 0, rem ;
        
        for( ;num != 0; num = num/10 ){

            rem = num % 10;
            reverse = reverse * 10 + rem;

        }

        System.out.print("The Reverse Number is "+reverse);

    }

}
