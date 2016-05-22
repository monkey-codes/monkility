package codes.monkey.monkility.lesson5;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by jzietsman on 4/8/16.
 */
public class PassingCarsTest {

    private PassingCars passingCars;

    @Before
    public void setup(){
        passingCars = new PassingCars();
    }

    @Test
    public void itShouldCountPassingCars(){

        assertEquals(5, passingCars.solution(new int[]{0,1,0,1,1}));
        assertEquals(0, passingCars.solution(new int[]{1,1,1,1,1}));
        assertEquals(0, passingCars.solution(new int[]{0,0,0,0,0}));
        assertEquals(2, passingCars.solution(new int[]{1,1,0,1,1}));
        assertEquals(0, passingCars.solution(new int[]{1,1,1,1,0}));
        assertEquals(0, passingCars.solution(new int[0]));
        int[] large = new int[Integer.MAX_VALUE/4];
        Arrays.fill(large, Integer.MAX_VALUE/8, large.length -1, 1);
        assertEquals(-1, passingCars.solution(large));

        System.out.println(Integer.MAX_VALUE);
    }

}