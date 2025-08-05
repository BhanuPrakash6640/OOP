package Practical2;

public class Stringcomparrision {
	public static void main(String[]args) {
		String n1="hello";
		String n2="hello";
		String n3= new String("Hello");
		String n4= "HELLO";
		
		System.out.printf("n1=n2:%s\n",n1==n2);
		System.out.printf("n1=n3:%s\n",n1=n3);
		
		System.out.printf("n1.equalsto(n2):%s\n",n1.equals(n2));
		System.out.printf("n1.equalsto(n3):%s\n",n1.equals(n3));
		
		System.out.printf("n1.equalsIgnorecase(n2):%s\n",n1.equalsIgnoreCase(n3));
		System.out.printf("s1.equals(s4): %b\n", n1.equals(n4)); 
	}

}
