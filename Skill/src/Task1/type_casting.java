
package Task1;

public class type_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int intVal = 100;
	        double doubleVal = intVal;

	        System.out.println("Widening Casting:");
	        System.out.println("int value: " + intVal);
	        System.out.println("Converted to double: " + doubleVal);

	        double originalDouble = 45.78;
	        int castedInt = (int) originalDouble;

	        System.out.println("\nNarrowing Casting:");
	        System.out.println("double value: " + originalDouble);
	        System.out.println("Converted to int: " + castedInt);
	}

}
