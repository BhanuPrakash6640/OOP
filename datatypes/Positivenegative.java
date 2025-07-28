package datatypes;

import java.util.Scanner;

public class Positivenegative {
public static void main(String[] args) { 
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number:");
	int number = scanner.nextInt();
		if(number>0) {
		System.out.println("the given number is a positive number");
		
	}else if(number<0) {
		System.out.println("the given number is a negative number");
	}else {
		System.out.println("the given number is zero");
	}
}
}
