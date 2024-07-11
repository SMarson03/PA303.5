import java.util.Scanner; //user input

public class GreatestCommonDenominator {
    public static void main(String[] args) {
//❖	Write a program that prompts the user to enter two positive integers, and find their greatest common divisor (GCD).
//❖	Examples:
//➢	Enter 2 and 4. The gcd is 2.
//➢	Enter 16 and 24.  The gcd is 8.
//❖	How do you find the gcd?
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int GCommDen = 1; //variable to store
        for (int i = 1; i <= n1;  i++) {
            if (n1 % i == 0 && n2 % i == 0){
                GCommDen = i;//changed the variable
            }
        }
        System.out.println(GCommDen);
    }
}
