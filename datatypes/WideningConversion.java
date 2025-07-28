package datatypes;
public class WideningConversion {
    public static void main(String[] args) {
        int num = 100;
        long l = num;         
        float f = l;          

        System.out.println("Int value: " + num);
        System.out.println("Long value (widened): " + l);
        System.out.println("Float value (widened): " + f);
    }
}
