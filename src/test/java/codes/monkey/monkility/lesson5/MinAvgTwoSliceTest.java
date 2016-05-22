package codes.monkey.monkility.lesson5;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by jzietsman on 4/12/16.
 */
public class MinAvgTwoSliceTest {

    private MinAvgTwoSlice avgTwoSlice;

    @Before
    public void setup(){
        avgTwoSlice = new MinAvgTwoSlice();
    }

    @Test
    public void itShouldCalculateAvgOfSlice(){

        assertEquals(0, avgTwoSlice.solution(new int[]{3,-2,3,1,2,4,1,1,2}));
        assertEquals(1, avgTwoSlice.solution(new int[]{1,-1,1,-1}));
        assertEquals(1, avgTwoSlice.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
        assertEquals(4, avgTwoSlice.solution(new int[]{5, 2, 2, 100, 1, 1, 100}));
        assertEquals(1, avgTwoSlice.solution(new int[]{11, 2, 10, 1, 100, 2, 9, 2, 100}));

        assertEquals(4, avgTwoSlice.solution(new int[]{1,2,2,99999,1,2,1}));
        assertEquals(0, avgTwoSlice.solution(new int[]{1,2,2,99999,1,2,2}));
        assertEquals(6, avgTwoSlice.solution(new int[]{44,33,1,2,2,99999,1,2,1,3433}));
        assertEquals(2, avgTwoSlice.solution(new int[]{44,33,1,2,4,99999,1,2,5,3433}));
        assertEquals(1, avgTwoSlice.solution(new int[]{4,2,2,5,1,5,8}));
        assertEquals(1, avgTwoSlice.solution(new int[]{1,1,-2,2}));
        assertEquals(0, avgTwoSlice.solution(new int[]{-3,-3,-2,-2,-1}));
        assertEquals(4, avgTwoSlice.solution(new int[]{4333,12312321,2323,4444,1,1,8}));
        assertEquals(2, avgTwoSlice.solution(new int[]{4,2,2,1,2,5,8}));
        assertEquals(0, avgTwoSlice.solution(new int[]{1,1,1,1,2,5,8}));
        assertEquals(5, avgTwoSlice.solution(new int[]{9,100,1234,12342,2433,5,8}));
        assertEquals(0, avgTwoSlice.solution(new int[]{1,Integer.MAX_VALUE}));
        assertEquals(0, avgTwoSlice.solution(new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE}));
//        Random random = new Random();
//        int[] randomInput = IntStream.range(0, 100000).map(i -> random.nextInt()).toArray();
//        System.out.println(avgTwoSlice.solution(randomInput));
    }

}