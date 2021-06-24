package CH_5_Primitive_Types;

// Write a program that multiplies two nonnegative integers without arithmetic operators. 
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        long x, y;
        long result;
        System.out.print("Enter first Integer Number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        System.out.print("Enter second Integer Number: ");
        y = sc.nextInt();

        // Convert Decimal to Binary number
        System.out.println("Binary representation of the first Integer: " + Long.toBinaryString(x));

        // Convert Decimal to Binary number
        System.out.println("Binary representation of the second Integer: " + Long.toBinaryString(y));
        result = multiply(x, y);

        System.out.println("The multiplication of " + x + " and " + y + " is " + result);
        
        // Convert Decimal to Binary number
        System.out.println("Binary representation of multiplication result: " + Long.toBinaryString(result));
    }

    public static long multiply(long x, long y) {
        long sum = 0;
        while (x != 0) {
            // Examines each bit of x.
            if ((x & 1) != 0) {
                sum = add(sum, y);
            }
            x >>>= 1;
            y <<= 1;
        }
        return sum;
    }

    private static long add(long a, long b) {
        long sum = 0, carryin = 0, k = 1, tempA = a, tempB = b;
        while (tempA != 0 || tempB != 0) {
            long ak = a & k, bk = b & k;
            long carryout = (ak & bk) | (ak & carryin) | (bk & carryin);
            sum |= (ak ^ bk ^ carryin);
            carryin = carryout << 1;
            k <<= 1;
            tempA >>>= 1;
            tempB >>>= 1;
        }
        return sum | carryin;
    }
}