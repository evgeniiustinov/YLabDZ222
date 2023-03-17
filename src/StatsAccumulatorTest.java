public class StatsAccumulatorTest {
    public static void main(String[] args) {
        StatsAccumulatorImpl test = new StatsAccumulatorImpl();
        test.add(123);
        test.add(13);
        test.add(12);
        test.add(33);
        test.add(2);
        System.out.println(test.getMin());
        System.out.println(test.getMax());
        System.out.println(test.getCount());
        System.out.println(test.getAvg());

    }
}
