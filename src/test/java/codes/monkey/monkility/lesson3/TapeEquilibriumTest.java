package codes.monkey.monkility.lesson3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jzietsman on 3/23/16.
 */
public class TapeEquilibriumTest {

    private TapeEquilibrium tapeEquilibrium;

    @Before
    public void setup() {
        tapeEquilibrium = new TapeEquilibrium();
    }

    @Test
    public void itShouldFindMininmumSplit() {
//        assertEquals(1, tapeEquilibrium.solution(a(3, 1, 2, 4, 3)));
        assertEquals(2, tapeEquilibrium.solution(a(3, 1)));
    }

    private int[] a(int... x) {
        return x;
    }
}