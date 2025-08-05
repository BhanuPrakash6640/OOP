package Task2;

public class StringManipulation {
	public static void main(String[]args) {
		String name = "BhanuPrakash";
		
		System.out.printf("Length:%d\n",name.length());
		
		System.out.printf("Uppercase: %s\n",name.toUpperCase());
		System.out.printf("Lowercase: %s\n",name.toLowerCase());
		 System.out.printf("Replace 'bhanu' with 'B': %s\n", name.replace("bhanu", "B"));
	        System.out.printf("Character at index 2: %c\n", name.charAt(2));

	        String full = name.concat("reddy");
	        System.out.printf("Full name: %s\n", full);
	}
}
