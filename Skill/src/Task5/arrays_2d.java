
package Task5;
import java.util.Scanner;

public class arrays_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your matrix size");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
	int [][]matrix= new int [rows][cols];
	System.out.println("Enter your elements into the matrix");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			matrix[i][j]=sc.nextInt();
			
		}
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(matrix[i][j]+" ");
			
		}
		System.out.println();
		
	}
	
		
	}

}
