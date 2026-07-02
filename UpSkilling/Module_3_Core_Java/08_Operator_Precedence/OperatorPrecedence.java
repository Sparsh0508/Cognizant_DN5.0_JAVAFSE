public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 / 5 + 3 * 4 - 2;
        int result4 = 8 + 12 / 4 * 3;
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("20 / 5 + 3 * 4 - 2 = " + result3);
        System.out.println("8 + 12 / 4 * 3 = " + result4);

        System.out.println("\nMultiplication and division have higher precedence than addition and subtraction.");
        System.out.println("Parentheses are evaluated first.");
    }
}
