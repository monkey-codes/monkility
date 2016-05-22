package codes.monkey.monkility.lesson5;

import java.util.function.Function;

/**
 * Created by jzietsman on 4/12/16.
 * The trick is to test slices of length 2 and 3, any larger slices that has a global min avg will contain
 * the 2 or 3 length slice.
 * https://codesays.com/2014/solution-to-min-avg-two-slice-by-codility/#comment-920
 * http://codility-lessons.blogspot.com/2014/07/lesson-3-minavgtwoslice.html
 * https://codility.com/demo/results/training7SGBF5-679/
 */
public class MinAvgTwoSlice {


    private Function<int[], Integer> strategy = this::solutionBigOn;

    public int solution(int[] A) {
        return strategy.apply(A);
    }

    public int solutionBigOn(int[] input) {
        float minAvg = Float.MAX_VALUE;
        int minIndex = Integer.MAX_VALUE;
        for (int i = 2; i <= input.length; i++) {
            int idx = i - 2;
            int twoSliceTotal = input[idx] + input[idx + 1];
            float twoSliceAvg = (float) twoSliceTotal / 2;
            float threeSliceAvg = (i == input.length) ? Float.MAX_VALUE : (float) (twoSliceTotal + input[i]) / 3;
            if (twoSliceAvg < minAvg || threeSliceAvg < minAvg) {
                minAvg = (twoSliceAvg < threeSliceAvg) ? twoSliceAvg : threeSliceAvg;
                minIndex = idx;
            }

        }
        return minIndex;
    }


    public int solutionBigOCubic(int[] A) {

        float minAvg = Integer.MAX_VALUE;
        int minAvgIndex = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                float total = 0;

                for (int x = i; x <= j; x++) {
                    total += A[x];
                }

                float number = (j - i) + 1;
                float avg = total / number;
                System.out.println(String.format("(%s,%s -> %s [%s])", i, j, total, avg));
                if (avg < minAvg) {
                    minAvg = avg;
                    minAvgIndex = i;
                }
            }
        }
        return minAvgIndex;
    }

}
