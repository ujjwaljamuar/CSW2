package CH_5_Primitive_Types;

/* Brian Kernighan’s Algorithm: By subtracting 1 from integer, an effective 
observation is that all the bits after the rightmost set bit are flipped including the rightmost set 
bit. */ 

import java.util.Scanner;

public class BrianKernighansAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        short count;
        System.out.println("Enter a number : ");
        x = sc.nextInt();
        System.out.println("The Binary representation of " + x + " is " + Long.toBinaryString(x));
        count = countbitsBrianKernighan(x);
        System.out.print("The Number of set bits in word " + x + " is " + count);
    }

    public static short countbitsBrianKernighan(int x) {
        short numBits = 0;
        while (x != 0) {
            x &= (x - 1);
            numBits += 1;
        }
        return numBits;
    }

}
