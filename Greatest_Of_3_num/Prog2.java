import java.util.*;;

public class Prog2 {

    // Using Ternary Method
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Number 3: ");
        int num3 = sc.nextInt();

        int temp = num1 > num2 ? num1 : num2;

        int result = num3 > temp ? num3 : temp;

        System.out.print(result+" is greatest!!!");

    }

}
