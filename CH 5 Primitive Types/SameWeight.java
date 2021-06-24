import java.util.Scanner;

/* Given an integer, write a programme to find a closest integer with the same weight.
    * The weight of a non-negative integer can be defined as, the number of set bits (i.e., 
      1’s) present in the binary representation of that integer. */

public class SameWeight {

    public static long closestlntSameBitCount(long x) {
        int NUM_UNSIGN_BITS = 64;
        // x is assumed to be non-negative so we know the leading bit is 0. We
        // restrict to our attention to 63 LSBs.

        for (int i = 0; i < NUM_UNSIGN_BITS - 1; ++i) {
            if ((((x >>> i) & 1) != ((x >>> (i + 1)) & 1))) {
                x ^= (1L << i) | (1L << (i + 1)); // Swaps bit-i and bit-(i + 1).
                return x;
            }
        }
        // Throw error if all bits of x are 0 or 1.
        throw new IllegalArgumentException("All bits are 0 or 1");
    }

    public static void main(String[] args) {
        long x;
        long closeInt;
        System.out.print("Enter an Integer Number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        // Convert Decimal to Binary number
        System.out.println("Binary representation of the given integer: " + Long.toBinaryString(x));
        closeInt = closestlntSameBitCount(x);
        System.out.println("The closest integer of " + x + " is " + closeInt);

        // Convert Decimal to Binary number
        System.out.println("Binary representation of the closest integer: " + Long.toBinaryString(closeInt));

    }
}
