package datatypes;
import java.util.Scanner;

public class BitwiseOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("x = " + x + " (" + Integer.toBinaryString(x) + ")");
        System.out.println("y = " + y + " (" + Integer.toBinaryString(y) + ")");

        System.out.println("x & y = " + (x & y) + " (" + Integer.toBinaryString(x & y) + ")");
        System.out.println("x | y = " + (x | y) + " (" + Integer.toBinaryString(x | y) + ")");
        System.out.println("x ^ y = " + (x ^ y) + " (" + Integer.toBinaryString(x ^ y) + ")");
        System.out.println("x << 1 = " + (x << 1) + " (" + Integer.toBinaryString(x << 1) + ")");
        System.out.println("x >> 1 = " + (x >> 1) + " (" + Integer.toBinaryString(x >> 1) + ")");
    }
}
