package codes.monkey.monkility.lesson4;

import java.util.stream.IntStream;

/**
 * Created by jzietsman on 3/31/16.
 * Sigma is the sum from 1..N (1+2+3+$...+N)
 * http://stackoverflow.com/questions/18168636/summation-function-in-java
 * https://codility.com/demo/results/trainingJSCU4C-4N8/
 */
public class PermCheck {
    public int solution(int[] A) {

        if (IntStream.of(A).distinct().sum() == sigma(A)) {
            return 1;
        }
        return 0;
    }

    public int sigma(int[] A) {
        int n = A.length;
        return (n * (n + 1)) / 2;
    }
}
