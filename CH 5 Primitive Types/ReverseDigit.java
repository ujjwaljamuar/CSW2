import java.util.Scanner;

public class ReverseDigit {
    
    public static void main(String[] args) {
        int x;
        long reverse;
        System.out.print("Enter an Integer Number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        reverse = reverse(x);
        System.out.println("The reverse integer of " + x + " is " + reverse);
    }

    public static long reverse(int x) {
        long result = 0;
        long xRemaining = Math.abs(x);
        while (xRemaining != 0) {
            result = result * 10 + xRemaining % 10;
            xRemaining /= 10;
        }
        return x < 0 ? -result : result;
    }
}
