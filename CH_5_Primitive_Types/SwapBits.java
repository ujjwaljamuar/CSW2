package CH_5_Primitive_Types;

// Write a programme to Swap bits in a given integer number

import java.util.Scanner;

public class SwapBits {
    public static long swapBits(long x,int i, int j){
        // Extract the i-th and j-th bits, and see if they differ.
        
        if( ((x >>> i) & 1) != ((x >>> j) & 1)){
            // We will swap them by flipping their values.
            // Select the bits to flip with bitMask. 
            long bitMask = (1L << i) | (1L << j);
            x ^= bitMask;
            }
            return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x, y;
        int i, j;
        System.out.print("Enter an Integer Number: ");        
        
        x = sc.nextInt();

        System.out.print("Enter 1st index value i (start from the right side): ");
        i = sc.nextInt();

        System.out.print("Enter 2nd index value j (start from the right side): ");
        j = sc.nextInt();

        //Convert Decimal to Binary number 
        System.out.println("Binary representation of the Number (Before Swapping): " + Long.toBinaryString(x));

        y= swapBits(x, i, j);
        System.out.println("After Swapping the integer is " + y);
        System.out.println("Binary representation of the Number (After Swapping): "    + Long.toBinaryString(y));

   }
}
