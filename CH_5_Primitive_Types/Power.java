package CH_5_Primitive_Types;

// Write a program that takes a double x and an integer y and returns xy.
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        double x;
        int y;
        double result;
        System.out.print("Enter first Double Number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();

        System.out.print("Enter second Integer Number: ");
        y = sc.nextInt();

        //Convert Decimal to Binary number 
        System.out.println("Binary representation of the first Integer: " + 
        Long.toBinaryString((long)x));

        //Convert Decimal to Binary number 
        System.out.println("Binary representation of the second Integer: " + 
        Long.toBinaryString(y));
        result = power(x, y);

        System.out.println("The " + x + "to the power " + y + " is " + result);

        //Convert Decimal to Binary number 
        System.out.println("Binary representation of the " + x + " to the power " + y + " is " + Long.toBinaryString((long)result));
        }

    public static double power(double x, int y){
        double result = 1.0;
        long power = y;
        //check power is positive
        //or negative
        if (y < 0) {
        power = -power;
        x = 1.0 / x;
        }
        while (power != 0) {
            // If power is odd, multiply
            // x with result
            if ((power & 1) != 0) {
                result *= x;
                }
                x *= x ; // Change x to x^2
                power >>>= 1; //power must be even now
                }
        return result;
        }
    }

