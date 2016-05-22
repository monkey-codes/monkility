package codes.monkey.monkility.lesson4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jzietsman on 3/31/16.
 * Write a function:

 class Solution { public int solution(int[] A); }

 that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0) that does not occur in A.

 For example, given:

 A[0] = 1
 A[1] = 3
 A[2] = 6
 A[3] = 4
 A[4] = 1
 A[5] = 2
 the function should return 5.

 Assume that:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 Elements of input arrays can be modified.

 */
public class MissingIntegerTest {

    private MissingInteger missingInteger;

    @Before
    public void setup(){
        missingInteger = new MissingInteger();
    }

    @Test
    public void itShouldFindSmallestPositiveInteger(){
        assertEquals(5,missingInteger.solution(new int[]{1,3,6,4,1,2}));
        assertEquals(1,missingInteger.solution(new int[]{2,3,4}));
        assertEquals(5,missingInteger.solution(new int[]{-10,1,3,6,4,1,2}));
        assertEquals(1,missingInteger.solution(new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE}));
        assertEquals(1,missingInteger.solution(new int[]{Integer.MAX_VALUE}));
        assertEquals(1,missingInteger.solution(new int[]{2}));
        assertEquals(1,missingInteger.solution(new int[]{-2}));
        assertEquals(1,missingInteger.solution(new int[]{0}));
        assertEquals(2,missingInteger.solution(new int[]{1}));
        assertEquals(1,missingInteger.solution(new int[0]));
    }
}