package bitsandwich.learning.algorithm.search;

public class BinarySearchTest extends AbstractIntSearcherTest {

    @Override
    IntSearcher getSearcher() {
        return new BinarySearcher();
    }
}