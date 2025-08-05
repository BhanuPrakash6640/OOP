package Task3;
import java.util.Scanner;

public class ControlFlowConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age >= 18)
            System.out.println("Adult, eligible to vote");
        else
            System.out.println("Not an adult, not eligible to vote");
    }
}
