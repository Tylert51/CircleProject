import java.util.Scanner;

public class CircleProjectBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the circular problem solver!");
        System.out.print("How many numbers are in a circle (n): ");
        int n = s.nextInt();

        int bitLength = Integer.toBinaryString(n).length();
        int bitMask = 1 << (bitLength-1);
        int notBitMask = ~(bitMask);
        int diff = notBitMask & n;
        int remainingNum = (diff << 1) + 1;

        System.out.println("The last number remaining is " + remainingNum);
    }
}