package Practical1;

import java.util.Scanner;

//Related to: Operators — Calculates area and perimeter using arithmetic operations

public class Operators {
	public static void main(String[]args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the length a rectangle:");
		int length= scanner.nextInt();
		
		System.out.println("Enter the Breath of a rectangle:");
		int breadth = scanner.nextInt();
		
		int area = length*breadth;
		int perimiter=2*(length+breadth);
		
		System.out.printf("Area: %d\n",area);
		System.out.printf("Perimeter: %d\n",perimiter);
		
		
	}

}
