public class SnilsValidatorImpl implements SnilsValidator {
    @Override
    public boolean validate(String snils) {
        char[] arr = snils.toCharArray();
        int productOfdigit = 0;
        for (int i = 0; i < 9; i++) {
            int number1 = Character.digit(arr[i], 10);
            int number2 = Character.digit(arr[8 - i], 10);
            int multiply = number1 * number2;
            productOfdigit = multiply + productOfdigit;
        }

        int controlOfNumber = 0;

        if (productOfdigit < 100) {
            controlOfNumber = productOfdigit;
        } else if (productOfdigit == 100) {
            controlOfNumber = 0;
        } else if (productOfdigit > 100) {
            int remainder = productOfdigit % 101;
            if (remainder == 100) {
                controlOfNumber = 0;
            } else {
                controlOfNumber = remainder;
            }
        }
        String firstJuniorRank = String.valueOf(arr[9]);
        String secondJuniorRank = String.valueOf(arr[10]);
        String twoRank = firstJuniorRank + secondJuniorRank;
        int numbersOfRank = Integer.parseInt(twoRank);
        return numbersOfRank == controlOfNumber;
    }
}
