import java.util.Scanner;

public class Prog2 {

    // This is the ternary methpd
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        int flag = ( year % 400 == 0 || ( year % 2 ==0 && year % 100 != 0 ) ) ? 1 : 0;

        if (flag == 1) {
            System.out.print(year+ " is leap year!!!");
        } else {
            System.out.print(year+ " is not leap year!!!");
        }


    }

}
