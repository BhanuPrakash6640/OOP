package Practical1;

import java.util.Scanner;
// Related to: Arrays — Counts how many elements are even and how many are odd
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int even = 0, odd = 0;

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Element %d: ", i + 1);
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.printf("Even numbers: %d\n", even);
        System.out.printf("Odd numbers: %d\n", odd);
    }
}
