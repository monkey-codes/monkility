package codes.monkey.monkility.lesson5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jzietsman on 4/8/16.
 */
public class CountDivTest {

    private CountDiv countDiv;

    @Before
    public void setup(){
        countDiv = new CountDiv();
    }


    @Test
    public void itShouldFindZeroModsBetweenTwoIndexes(){
        assertEquals(countDiv.longWay(6,11,2), countDiv.solution(6, 11, 2));
        assertEquals(countDiv.longWay(6,12,2), countDiv.solution(6, 12, 2));
        assertEquals(countDiv.longWay(11,345,17), countDiv.solution(11, 345, 17));
        assertEquals(countDiv.longWay(0,5,2), countDiv.solution(0, 5, 2));
        assertEquals(6, countDiv.solution(0, 5, 1));
        assertEquals(3, countDiv.solution(1, 9, 3));
        assertEquals(2, countDiv.solution(0, 1, 1));
        assertEquals(0, countDiv.solution(1, 1, 2));
        assertEquals(1, countDiv.solution(0, 0, 11));
        assertEquals(1, countDiv.solution(1, 1, 1));
        assertEquals(6, countDiv.solution(0, 10, 2));
        assertEquals(countDiv.longWay(6,10,2), countDiv.solution(6, 10, 2));
    }


}