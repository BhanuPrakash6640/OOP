package practical1;
//Related to: Data Types and Type Conversion — Demonstrates implicit widening conversion (int → long → float)

import java.util.Scanner;

public class Datatype{
 public static void main(String[]args) {
	 Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Enter a number:");
	 int num = 200;
	 long l = num;
	 float f = l;
	 
	 System.out.printf("The int value:%d\n",num);
	 System.out.printf("Long value:%d\n",l);
	 System.out.printf("Float value;%.2f\n",f); 	
	 
	 
 }

}
