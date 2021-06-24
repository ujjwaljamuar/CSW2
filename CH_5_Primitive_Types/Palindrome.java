package CH_5_Primitive_Types;

import java.util.Scanner;

// Write a program that takes an integer and check that number is palindrome or not.
public class Palindrome {
    public static boolean isPalindromeNumber(int x) {
        if (x < 0) {
        return false;
        }
        final int numDigits = (int) (Math . floor (Math . log10(x))) + 1;
        int msdMask = (int)Math .pow(10 , numDigits - 1);
        for (int i = 0; i < (numDigits / 2); ++i) {
            if (x / msdMask != x % 10) {
                return false ;
            }
        x %= msdMask; // Remove the most significant digit of x.
        x /= 10; // Remove the least significant digit of x.

        msdMask /= 100;
        }
        return true ;
    }

    public static void main(String[] args) {
        int x;
        boolean result;
        System.out.print("Enter an Integer Number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        result = isPalindromeNumber(x); // true or false
        if(result) { 
            System.out.println("The integer " + x + " is palindrome.");
        }
        else { 
            System.out.println("The integer " + x + " is not palindrome.");
        }
    }
}

