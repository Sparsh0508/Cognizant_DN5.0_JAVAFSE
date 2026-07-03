public class TypeCastingExample {
    public static void main(String[] args) {
        double num = 45.89;
        int intValue = (int) num;
        int number = 25;
        double doubleValue = number;
        System.out.println("Original double: " + num);
        System.out.println("Double to int: " + intValue);
        System.out.println("Original int: " + number);
        System.out.println("Int to double: " + doubleValue);
    }
}
