
package Practical2;
import java.util.Scanner;

 public class String_buffer_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your string:");
		String str1=sc.nextLine();
		StringBuffer sb= new StringBuffer(str1 );
		sb.insert(0,"Start:");
		sb.delete(0,6);
		sb.insert(0,"hello ");
		
		System.out.println("the length of the string buffer:"+sb.capacity());
		System.out.println("After using the String buffer the given String is:"+sb);
		System.out.println("Reversing the String buffer :"+sb.reverse());;

		
		sc.close();
		
	}

}
