package Task2;

public class StringImmutability {
	public static void main(String[]args) {
		String message= "Hello";
		System.out.printf("original message:%d\n", message);
		
		message.concat("world");
		
	}

}
