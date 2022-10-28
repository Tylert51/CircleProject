import java.util.Scanner;

public class CircleProject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the circular problem solver!");
        System.out.print("How many numbers are in a circle (n): ");
        int n = s.nextInt();

        int lowestNum = 0;
        for (int i = 1; lowestNum < n; i++) {
            lowestNum = (int) Math.pow(2,i);
        }
        lowestNum /= 2;

        int nthTerm = n - lowestNum;
        int nthTermValue = (nthTerm * 2) + 1;

        System.out.println("The last number remaining is " + nthTermValue);
    }
}