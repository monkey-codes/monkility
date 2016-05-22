package codes.monkey.monkility.lesson3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jzietsman on 3/23/16.
 */
public class FrogJmpTest {

    private FrogJmp frogJmp;

    @Before
    public void setup(){
        frogJmp = new FrogJmp();
    }

    @Test
    public void itShouldCalculateJumps(){
        assertEquals(3, frogJmp.solution(10, 85, 30));
        assertEquals(33333334, frogJmp.solution(10, 1000000005, 30));
    }
}