import java.util.Scanner;

public class CircleProject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the circular problem solver!");
        System.out.print("How many numbers are in a circle (n): ");
        int n = s.nextInt();

        int lowestNum = 0;
        int counter = 1;
        while (lowestNum <= n) {
            lowestNum = (int) Math.pow(2,counter);
            counter++;
        }
        lowestNum /= 2;

        int nthTerm = n - lowestNum;
        int nthTermValue = (nthTerm * 2) + 1;

        System.out.println("The last number remaining is " + nthTermValue);
    }
}