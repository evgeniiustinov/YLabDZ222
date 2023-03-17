public class RateLimitedPrinterTest {
    public static void main(String[] args) {
        RateLimitedPrinter test = new RateLimitedPrinter(1000);
        for (int i = 0; i < 1_000_000_000; i++) {
            test.print(String.valueOf(i));
        }
    }
}
