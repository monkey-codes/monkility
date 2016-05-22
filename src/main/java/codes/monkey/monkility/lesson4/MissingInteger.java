package codes.monkey.monkility.lesson4;

import java.util.stream.IntStream;

/**
 * Created by jzietsman on 3/31/16.
 * https://codility.com/demo/results/trainingBKPF78-5V6/
 */
public class MissingInteger {

    public int solution(int[] A) {
        int[] ints = IntStream.of(A).filter(x -> x > 0).sorted().distinct().toArray();
        if(ints.length == 0 || (ints.length >= 1 && ints[0] > 1)) return 1;
        for (int i = 1; i < ints.length; i++) {
            int expectedNext = ints[i - 1] + 1;
            if(expectedNext != ints[i]) return expectedNext;
        }
        // write your code in Java SE 8
        return ints[ints.length-1]+1;
    }

}
