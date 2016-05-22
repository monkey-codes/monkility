package codes.monkey.monkility.lesson2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jzietsman on 3/22/16.
 */
public class CyclicRotationTest {

    private CyclicRotation cyclicRotation;

    @Before
    public void setUp() throws Exception {
        cyclicRotation = new CyclicRotation();

    }

    @Test
    public void itShouldRotate() {
        assertArrayEquals(a(3, 1, 2), rotate(a(1, 2, 3), 1));
        assertArrayEquals(a(3), rotate(a(3), 1));
        assertArrayEquals(a(2, 1), rotate(a(1, 2), 1));
        assertArrayEquals(a(1, 2, 3), rotate(a(1, 2, 3), 3));
        assertArrayEquals(a(3, 1, 2), rotate(a(1, 2, 3), 4));
        assertArrayEquals(a(2, 3, 1), rotate(a(1, 2, 3), -1));
        assertArrayEquals(a(3, 1, 2), rotate(a(1, 2, 3), -2));
        assertArrayEquals(a(1, 2, 3), rotate(a(1, 2, 3), -3));
        assertArrayEquals(a(2, 3, 1), rotate(a(1, 2, 3), -4));
        assertArrayEquals(new int[0], rotate(new int[0], 4));
    }

    private int[] rotate(int[] a, int k) {
        return cyclicRotation.solution(a, k);
    }

    private int[] a(int... i) {
        return i;
    }


}