public class ComplexNumbersImpl implements ComplexNumbers {

    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumbersImpl(double realPart) {
        this(realPart, 0.0);
    }

    public ComplexNumbersImpl(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getModule() {
        return Math.hypot(realPart, imaginaryPart);
    }

    public ComplexNumbersImpl plus(ComplexNumbersImpl b) {
        ComplexNumbersImpl a = this;
        double real = a.realPart + b.realPart;
        double imag = a.imaginaryPart + b.imaginaryPart;
        return new ComplexNumbersImpl(real, imag);
    }

    public ComplexNumbersImpl minus(ComplexNumbersImpl b) {
        ComplexNumbersImpl a = this;
        double real = a.realPart - b.realPart;
        double imag = a.imaginaryPart - b.imaginaryPart;
        return new ComplexNumbersImpl(real, imag);
    }

    public ComplexNumbersImpl multiply(ComplexNumbersImpl b) {
        ComplexNumbersImpl a = this;
        double real = a.realPart * b.realPart - a.imaginaryPart * b.imaginaryPart;
        double imag = a.realPart * b.imaginaryPart + a.imaginaryPart * b.realPart;
        return new ComplexNumbersImpl(real, imag);
    }


    public String toString() {
        if (imaginaryPart == 0) return imaginaryPart + "";
        if (imaginaryPart == 0) return imaginaryPart + "i";
        if (imaginaryPart < 0) return realPart + " - " + (-imaginaryPart) + "i";
        return realPart + " + " + imaginaryPart + "i";
    }


}
