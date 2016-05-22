package codes.monkey.monkility.lesson5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jzietsman on 4/8/16.
 */
public class GenomicRangeQueryTest {


    private GenomicRangeQuery genomicRangeQuery;

    @Before
    public void setup() {
        genomicRangeQuery = new GenomicRangeQuery();
    }


    @Test
    public void itShouldFindMinImpactFactor() {
        assertArrayEquals(
                new int[]{2, 4, 1},
                genomicRangeQuery.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})
        );
        assertArrayEquals(
                new int[]{4, 4, 4, 2, 2, 2},
                genomicRangeQuery.solution("TTTTCC", new int[]{0, 0, 1, 3, 4, 0}, new int[]{0, 2, 3, 4, 4, 4})
        );
        assertArrayEquals(
                new int[]{2},
                genomicRangeQuery.solution("TTTTCC", new int[]{0}, new int[]{4})
        );
        assertArrayEquals(
                new int[]{4},
                genomicRangeQuery.solution("T", new int[]{0}, new int[]{0})
        );
        assertArrayEquals(
                new int[]{1},
                genomicRangeQuery.solution("TAT", new int[]{1}, new int[]{2})
        );

        assertArrayEquals(
                new int[]{4,1,1,4},
                genomicRangeQuery.solution("TAT", new int[]{0,0,1,2}, new int[]{0,1,2,2})
        );
    }


}