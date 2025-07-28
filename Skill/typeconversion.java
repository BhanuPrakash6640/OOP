
// Topic: Type Conversion
//From int to float

public class typeconversion {
    public static void main(String[] args) {
        int num = 100;
        float f = num; 

        System.out.printf("Original int value: %d\n", num);
        System.out.printf("After widening to float: %.2f\n", f);
    }
}
