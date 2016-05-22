package codes.monkey.monkility.lesson2;

import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

/**
 * Created by jzietsman on 3/22/16.
 * https://codility.com/demo/results/trainingT6BD2D-AQK/
 */
public class CyclicRotation {
    BiFunction<int[], Integer, int[]> strategy = this::functional;

    public int[] solution(int[] A, int K) {
        return strategy.apply(A, K);
    }

    public int[] imperative(int[] A, int K) {

        if (A == null || A.length == 0) return A;
        K = (A.length + (K % A.length)) % A.length;

        int[] x = A;
        for (int i = 0; i < K; i++) {
            x = rotate(x);
        }
        return x;
    }

    private int[] rotate(int[] a) {

        int[] x = new int[a.length];
        x[0] = a[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            x[i + 1] = a[i];
        }
        return x;
    }


    public int[] functional(int[] A, int K) {
        if(A.length == 0 || A == null) return A;
        final int IK = (A.length + (K % A.length)) % A.length;
        Integer[] integers = IntStream.range(0, A.length)
                .boxed()
                .map(idx -> asList(idx, (idx + IK) % A.length))
                .sorted((pair1, pair2) -> Integer.compare(pair1.get(1), pair2.get(1)))
                .map(pair -> A[pair.get(0)])
                .collect(Collectors.toList()).toArray(new Integer[0]);

        return toPrimitive(integers);
    }

    private int[] toPrimitive(Integer[] integers) {
        int[] x = new int[integers.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = integers[i];
        }
        return x;
    }

}
