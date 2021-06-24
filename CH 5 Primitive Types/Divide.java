
/* Given two positive integers, such as x and y. Write a programme to 
compute x/y (their quotient), using only the addition, subtraction, and 
shifting operators. */
import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        long x, y;
        long quotient;
        System.out.print("Enter first Integer (Dividend): ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        System.out.print("Enter second Integer (Divisor): ");
        y = sc.nextInt();

        //Convert Decimal to Binary number 
        System.out.println("Binary representation of the first Integer (Dividend): " + 
        Long.toBinaryString(x));

        //Convert Decimal to Binary number 
        System.out.println("Binary representation of the second Integer (Divisor): " + 
        Long.toBinaryString(y));
        quotient = divide(x, y);

        System.out.println("The Division of " + x + " and " + y + " is " + quotient);
        
        //Convert Decimal to Binary number 
        System.out.println("Binary representation of quotient: " + 
        Long.toBinaryString(quotient));
        }

    public static long divide(long x, long y) {
        long result = 0;
        int k = 4; //32
        long yPower = y << k ;
        while (x >= y) {
        while (yPower > x) {
            yPower >>>= 1;
            --k ;
            }
        result += 1L << k;
        x -= yPower;
        }
    return result;
    }
}


