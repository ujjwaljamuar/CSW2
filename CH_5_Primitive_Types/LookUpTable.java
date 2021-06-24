package CH_5_Primitive_Types;

import java.util.Scanner;

public class LookUpTable {
    public static void main(String[] args) {
        int x;
        short count;
        System.out.print("Enter an Integer Number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        // Convert Decimal to Binary number
        System.out.println("Binary representation of the Number: " + Long.toBinaryString(x));
        count = countbitsLookupTable(x);
        System.out.print("The Number of set bits in word " + x + " is " + count);
    }

    public static short countbitsLookupTable(int x) {
        short numBits = 0;
        int Table[] = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };

        while (x != 0) {
            numBits += Table[x & 0x0f]; // 0x0f means 0000 1111
            x >>>= 4;

        }
        return numBits;
    }
}
