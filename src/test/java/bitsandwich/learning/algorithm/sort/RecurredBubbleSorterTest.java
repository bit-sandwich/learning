package bitsandwich.learning.algorithm.sort;

public class RecurredBubbleSorterTest extends AbstractIntSorterTest {
    @Override
    IntSorter getSorter() {
        return new RecurredBubbleSorter();
    }
}