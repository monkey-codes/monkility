package codes.monkey.monkility.lesson4;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by jzietsman on 3/31/16.
 * RESPECTABLE!!!!
 * https://codility.com/demo/results/training89TNHC-GKS/ -- too slow
 * https://codility.com/demo/results/trainingQ7NRSJ-C94/ -- take 2
 */
public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int currentMax = 0;
        int lastSync = 0;
        for (int i = 0; i < A.length; i++) {
            int current = A[i];
            if (current >= 1 && current <= N) {
                int cIdx = current - 1;
                counters[cIdx] = counters[cIdx] < lastSync ? lastSync + 1 : counters[cIdx] + 1;
                currentMax = counters[cIdx] > currentMax ? counters[cIdx] : currentMax;
            } else if (current == N + 1) {
                lastSync = currentMax;
            }
        }
        if (lastSync > 0) {
            for (int i = 0; i < counters.length; i++) {
                counters[i] = counters[i] < lastSync ? lastSync : counters[i];
            }
        }

        return counters;
    }


    public int[] firstAttempt(int N, int[] A) {
        int[] counters = new int[N];
        IntStream.of(A).reduce(0, (result, current) -> {
                    if (current >= 1 && current <= N) {
                        counters[current - 1]++;
                        return counters[current - 1] > result ? counters[current - 1] : result;
                    } else if (current == N + 1) {
                        Arrays.fill(counters, result);
                    }
                    return result;
                }
        );
        return counters;
    }
}
