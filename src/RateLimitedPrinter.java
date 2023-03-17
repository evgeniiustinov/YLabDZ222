public class RateLimitedPrinter {
    private final int interval;
    private long currentTime;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
        this.currentTime = System.currentTimeMillis();


    }

    public void print(String message) {
        if ((System.currentTimeMillis() - this.currentTime) > (long) this.interval) {
            System.out.println(message);
            this.currentTime = System.currentTimeMillis();
        }


    }
}
