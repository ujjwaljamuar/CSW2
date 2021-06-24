import java.util.Scanner;

// Write a programme to Reverse bits in a given integer number.
// Write a program that takes a 64-bit word and returns the 64-bit word consisting of the bits of the input word in reverse order.

public class ReverseBits {

    public static long reverseBits(long x) {
        final int WORD_SIZE = 2;
        final int BIT_MASK = 3; // 00000011 (in Binary)
                            // index 0  1  2  3
        int precomputedReverse[] = { 0, 2, 1, 3 };
        return (precomputedReverse[(int) (x & BIT_MASK)] << (3 * WORD_SIZE)
                | precomputedReverse[(int) ((x >>> WORD_SIZE) & BIT_MASK)] << (2 * WORD_SIZE)
                | precomputedReverse[(int) ((x >>> (2 * WORD_SIZE)) & BIT_MASK)] << WORD_SIZE
                | precomputedReverse[(int) ((x >>> (3 * WORD_SIZE)) & BIT_MASK)]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x;
        long reverse;
        System.out.print("Enter an Integer Number: ");
        x = sc.nextInt();

        // Convert Decimal to Binary number
        System.out.println("Binary representation of the Number (Before Reverse): " + Long.toBinaryString(x));
        reverse = reverseBits(x);
        System.out.println("After Reverse the integer is " + reverse);
        // Convert Decimal to Binary number
        System.out.println("Binary representation of the Number (After Reverse): " + Long.toBinaryString(reverse));
    }
}
