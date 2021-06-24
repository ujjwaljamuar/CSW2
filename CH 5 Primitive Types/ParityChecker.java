import java.util.Scanner;

/*  The brute-force algorithm perform bit-wise right shift on the given number iteratively & check the number of 1s seen at least significant bit (LSB).
The parity of 1011 is 1, because there are 3 ones.
The parity of 10001000 is 0, because there are 2 ones. 
*/
public class ParityChecker {
    public static short parity(long x) {
        short result = 0;

        while (x != 0) {
            result ^= (x & 1);
            x >>>= 1;
        }

        return result;
    }

    /* or
    public static short parity(long x){
    short result = 0;
    while (x != 0) {
    result ^= 1;
    x &= (x - 1); // Drops the lowest set bit of x.
    }
    return result;

    */

    public static void main(String[] args) {
        int x;
        short count;
        System.out.print("Enter an Integer Number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        // Convert Decimal to Binary number
        System.out.println("Binary representation of the Number: " + Long.toBinaryString(x));

        count = parity(x);
        System.out.print("The Parity of word " + x + " is " + count);
    }
}
