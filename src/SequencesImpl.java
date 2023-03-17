public class SequencesImpl implements SequenceGenerator {
    @Override
    public void a(int n) {
        System.out.print("A. ");
        int nextNumber = 0;
        for (int i = 0; i < n; i++) {
            nextNumber = 2 + nextNumber;
            System.out.print(nextNumber + "," + " ");
        }
        System.out.println();
    }

    @Override
    public void b(int n) {
        System.out.print("B. ");
        int nextNumber = -1;
        for (int i = 0; i < n; i++) {
            nextNumber = 2 + nextNumber;
            System.out.print(nextNumber + "," + " ");
        }
        System.out.println();

    }

    @Override
    public void c(int n) {
        System.out.print("C. ");
        int firstNumber = 0;
        int numberToIncrease = 1;
        int nextNumber;
        for (int i = 0; i < n; i++) {
            nextNumber = firstNumber + numberToIncrease;
            System.out.print(nextNumber + "," + " ");
            numberToIncrease = numberToIncrease + 2;
            firstNumber = nextNumber;

        }
        System.out.println();

    }

    @Override
    public void d(int n) {
        System.out.print("D. ");
        int firstNumber = 1;
        int nextNumber;
        for (int i = 0; i < n; i++) {
            nextNumber = firstNumber * firstNumber * firstNumber;
            System.out.print(nextNumber + "," + " ");
            firstNumber = firstNumber + 1;
        }
        System.out.println();
    }

    @Override
    public void e(int n) {
        System.out.print("E. ");
        int number = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(number + "," + " ");
            number = -number;
        }
        System.out.println();

    }

    @Override
    public void f(int n) {
        System.out.print("F. ");
        int number = 1;
        int negativeNumber;
        for (int i = 0; i < n; i++) {
            if ((number % 2) == 0) {
                negativeNumber = -number;
                System.out.print(negativeNumber + "," + " ");
            } else {
                System.out.print(number + "," + " ");
            }
            number = number + 1;
        }
        System.out.println();

    }

    @Override
    public void g(int n) {
        System.out.print("G. ");
        int number = 1;
        int negativeNumber;
        for (int i = 0; i < n; i++) {
            int squareNumber = number * number;
            if ((squareNumber % 2) == 0) {
                negativeNumber = -squareNumber;
                System.out.print(negativeNumber + "," + " ");
            } else {
                System.out.print(squareNumber + "," + " ");
            }
            number = number + 1;
        }
        System.out.println();
    }

    @Override
    public void h(int n) {
        System.out.print("H. ");
        int zero = 0;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            if ((i % 2) == 0) {
                zero = 0;
                System.out.print(zero + "," + " ");
                number = number + 1;
            } else {
                System.out.print(number + "," + " ");

            }
        }
        System.out.println();

    }

    @Override
    public void i(int n) {
        System.out.print("I. ");
        int nextNumber;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            nextNumber = number * i;
            System.out.print(nextNumber + "," + " ");
            number = nextNumber;
        }
        System.out.println();

    }

    @Override
    public void j(int n) {
        System.out.print("J. ");
        int numberOne = 1;
        int numberTwo = 0;
        int nextNumber;
        for (int i = 0; i < n; i++) {
            nextNumber = numberOne + numberTwo;
            System.out.print(nextNumber + "," + " ");
            numberOne = numberTwo;
            numberTwo = nextNumber;
        }
        System.out.println();
    }
}
