package codes.monkey.monkility.lesson6;

import java.util.Arrays;

/**
 * Created by jzietsman on 4/19/16.
 */
public class MaxProductOfThree {
    public int solution(int[] ints) {
        Arrays.sort(ints);
        int last = ints.length - 1;
        return ints[last] * ints[last-1] * ints[last-2];
    }
}
