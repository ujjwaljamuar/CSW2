package CH_5_Primitive_Types;

/* Write an efficient program to count number of 1s in the binary representation of an integer. */

import java.util.Scanner;

public class CountBits {
    public static short countBitsModulo(int x) {
        short numBits = 0;
        while (x != 0) {
            if (x % 2 == 1) {
                numBits += 1;
            }
            x >>>= 1;
        }
        return numBits;
    }

    /*
     * or while (x != 0) { numBits += (x & 1) ; x >>>= 1; } return numBits; }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        short count;
        System.out.println("Enter an integer : ");
        x = sc.nextInt();

        System.out.println("Binary representation of " + x + " is " + Long.toBinaryString(x));

        count = countBitsModulo(x);

        System.out.println("The nummber of 1s in " + x + " is " + count);

        sc.close();
    }
}
