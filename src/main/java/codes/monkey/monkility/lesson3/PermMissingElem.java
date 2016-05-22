package codes.monkey.monkility.lesson3;

import java.util.Arrays;

/**
 * Created by jzietsman on 3/23/16.
 * https://codility.com/demo/results/trainingD4ZB4D-QQ9/
 */
public class PermMissingElem {

    public int solution(int[] ints) {
        Arrays.sort(ints);
        for (int i = 1; i <= ints.length; i++) {
            if(ints[i-1] != i) return i;
        }
        return ints.length+1;
    }
}
