package codes.monkey.monkility.lesson4;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by jzietsman on 3/31/16.
 * https://codility.com/demo/results/trainingQFKBYY-BRK/
 */
public class FrogRiverOne {

    public int solution(int X, int[] A) {
        Set<Integer> collect = IntStream.range(1, X+1).boxed().collect(Collectors.toSet());
        for (int i = 0; i < A.length; i++) {
            collect.remove(A[i]);
            if(collect.size() == 0) return i;
        }
        return -1;
    }
}
