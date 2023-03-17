import java.util.ArrayList;
import java.util.Collections;

public class StatsAccumulatorImpl implements StatsAccumulator {
    private final ArrayList<Integer> listOfNumbers = new ArrayList<>();

    @Override
    public void add(int value) {
        listOfNumbers.add(value);
    }

    @Override
    public int getMin() {
        return Collections.min(listOfNumbers);
    }

    @Override
    public int getMax() {
        return Collections.max(listOfNumbers);
    }

    @Override
    public int getCount() {
        return listOfNumbers.size();
    }

    @Override
    public Double getAvg() {
        int sum = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            sum = sum + listOfNumbers.get(i);
        }
        double average = (double) sum / listOfNumbers.size();
        return average;
    }
}
