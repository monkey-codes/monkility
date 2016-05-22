package codes.monkey.monkility.lesson1;

import org.junit.Before;
import org.junit.Test;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.*;

/**
 * Created by jzietsman on 3/22/16.
 */
public class BinaryGapTest {

    private BinaryGap binaryGap;

    @Before
    public void setUp() throws Exception {
        binaryGap = new BinaryGap();

    }

    @Test
    public void itShouldFindTheBinaryGap() {
        assertEquals(2, binaryGap.solution(parseInt("1001", 2)));
        assertEquals(0, binaryGap.solution(parseInt("1", 2)));
        assertEquals(0, binaryGap.solution(parseInt("100", 2)));
        assertEquals(2, binaryGap.solution(parseInt("100100", 2)));
        assertEquals(0, binaryGap.solution(parseInt("11", 2)));
        assertEquals(1, binaryGap.solution(parseInt("101", 2)));
        assertEquals(1, binaryGap.solution(parseInt("000101", 2)));
        assertEquals(0, binaryGap.solution(parseInt("100000", 2)));
        assertEquals(3, binaryGap.solution(parseInt("10001001", 2)));
        assertEquals(30, binaryGap.solution(Integer.MIN_VALUE+1));
        assertEquals(0, binaryGap.solution(Integer.MAX_VALUE));
        assertEquals(0, binaryGap.solution(0));
    }

}