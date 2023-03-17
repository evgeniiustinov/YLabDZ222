public class ComplexNumbersTest {
    public static void main(String[] args) {
        ComplexNumbersImpl number1 = new ComplexNumbersImpl(2.3, 3.4);
        ComplexNumbersImpl number2 = new ComplexNumbersImpl(5.5, 0.3);
        System.out.println(number1.plus(number2));
        System.out.println(number1.minus(number2));
        System.out.println(number1.multiply(number2));
        System.out.println(number1.getModule());
        System.out.println(number2.getModule());
        String str1 = number1.toString();
        String str2 = number2.toString();
        System.out.println(str1);
        System.out.println(str2);
        ComplexNumbersImpl number3 = new ComplexNumbersImpl(9.0);
        System.out.println(number3.getModule());
        String str3 = number3.toString();
        System.out.println(str3);

    }
}
