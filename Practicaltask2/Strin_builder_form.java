package Practicaltask2;

import java.util.Scanner;

public class Strin_builder_form {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name for the string");
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        sb.insert(0,"hello");
        System.out.println("after String builder: "+sb+" length of the String using String Builder: "+sb.length());
        System.out.println("reversing the string builder"+sb.reverse());
        
        
        
        sc.close();
     
        
	}

}