
package Task5;
import java.util.Scanner;

public class Array_1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your array size");
		int n=sc.nextInt();
		int numbers[]=new int [n];
		
		for(int i=0;i<n;i++) {
		 numbers[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
			System.out.println("the arrays are: "+numbers[i]);
	}

}
