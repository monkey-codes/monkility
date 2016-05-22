package codes.monkey.monkility.lesson2;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by jzietsman on 3/22/16.
 */
public class OddOccurrencesInArrayTest {

    private OddOccurrencesInArray oddOccurrencesInArray;

    @Before
    public void setup(){
        oddOccurrencesInArray = new OddOccurrencesInArray();
    }


    @Test
    public void itShouldFindOddOccurrences(){
        assertEquals(7, oddOccurrencesInArray.solution(a(9,3,9,3,9,7,9)));
        assertEquals(4, oddOccurrencesInArray.solution(a(1,1,3,3,4)));
        assertEquals(4, oddOccurrencesInArray.solution(a(1,3,1,3,4)));
        List<Integer> large = IntStream.range(0, 999998).map(i -> 2).boxed().collect(Collectors.toList());
        large.add(3);
        assertEquals(3, oddOccurrencesInArray.solution(toPrimitive(large)));
    }


    private int[] toPrimitive(List<Integer> integers) {
        int[] x = new int[integers.size()];
        for (int i = 0; i < x.length; i++) {
            x[i] = integers.get(i);
        }
        return x;
    }


    private int[] a(int... i){
        return i;
    }


}