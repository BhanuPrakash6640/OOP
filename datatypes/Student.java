package datatypes;

import java.util.Scanner;

public class Student {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the student name:");
		String name = scanner.nextLine();
		
		System.out.println("Enter the Roll Number:");
		int roll = scanner.nextInt();
		
		System.out.println("Enter age");
		int age = scanner.nextInt();
		
		System.out.println("Enter The Gender (M/f):");
		char gender = scanner.next().charAt(0);
		
		System.out.println("Enter Percentage:");
		float percentage = scanner.nextFloat();
		
		 System.out.printf("\n--- Student Details ---\n");
	        System.out.printf("Name      : %s\n", name);
	        System.out.printf("Roll No.  : %d\n", roll);
	        System.out.printf("Age       : %d\n", age);
	        System.out.printf("Gender    : %c\n", gender);
	        System.out.printf("Percentage: %.2f%%\n", percentage);
					
		
		
	}
	

}
