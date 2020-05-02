package common.algos;

import common.algos.MergeSort;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void mergeSortTest() {
        int[] someArray = {1, 3, 16, 4, 8, 7, 19};
        MergeSort.solution(someArray);
    }
}
