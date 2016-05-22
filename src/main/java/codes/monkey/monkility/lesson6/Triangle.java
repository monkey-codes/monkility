package codes.monkey.monkility.lesson6;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by jzietsman on 4/19/16.
 * I think the question is ambiguous. It seems to make a constraint on the index order ( 0 ≤ P < Q < R < N )
 * Yet the solution is to sort the array, then 2 assumptions can be made
 * P + R > Q and Q + R > P since R is guaranteed to be bigger after the sort. Finally run through the sorted array
 * testing for adjacent items to determine if P + Q > R.
 */
public class Triangle {

    private Function<int[], Integer> strategy = this::solution2;

    public int solution(int[] input) {
        return strategy.apply(input);
    }

    public int solution2(int[] input){
        if(input.length < 3) return 0;

        Arrays.sort(input);
        for (int i = 0; i < input.length - 2; i++) {
            int p = input[i];
            int q = input[i+1];
            int r = input[i+2];
            System.out.printf("(%s,%s,%s)\n", p,q,r);
            if(p + q > r) return 1;
        }
        return  0;
    }

    public int solutionNLogN(int[] input) {
        int[][] split = split(input);
        System.out.println(split);
        return recurse(input);
    }

    public int recurse(int[] input) {
//        if (input == null || input.length <= 1) {
        if (input.length < 3) {
            return 0;
        }
        System.out.println(input.length);
        int[][] split = split(input);
        int p1 = recurse(split[0]);
        int p2 = recurse(split[1]);
        int p3 = recurse(split[2]);
        if (p1 + p2 + p3 > 0) return 1;

        for (int p = 0; p < split[0].length; p++) {
            for (int q = 0; q < split[1].length; q++) {
                for (int r = 0; r < split[2].length; r++) {
                      if(isTriangle(split[0][p], split[1][q], split[2][r])){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public int[][] split(int[] input) {

        int splitSize = input.length / 3;

        int[][] r = new int[3][0];
        if(splitSize == 0){
            for (int i = 0; i < input.length ; i++) {
                r[i] = new int[]{input[i]};
            }
            return r;
        }
        r[0] = new int[splitSize];
        r[1] = new int[splitSize];
        r[2] = new int[input.length - (splitSize * 2)];
        System.arraycopy(input, 0, r[0], 0, splitSize);
        System.arraycopy(input, splitSize, r[1], 0, splitSize);
        System.arraycopy(input, splitSize * 2, r[2], 0, input.length - (splitSize * 2));
        return r;
    }

    public int solutionCubic(int[] input) {
        for (int p = 0; p < input.length - 2; p++) {
            for (int q = p + 1; q < input.length - 1; q++) {
                for (int r = q + 1; r < input.length; r++) {
//                    System.out.printf("(%s,%s,%s)", p, q, r);
                    if (isTriangle(input[p], input[q], input[r])) {
                        System.out.printf("(%s,%s,%s)", p, q, r);
                        return 1;
                    }
                }
            }
        }
        return 0;
    }


    private boolean isTriangle(int p, int q, int r) {
        if (p + q > r &&
                q + r > p &&
                r + p > q
                ) {
//            System.out.printf("(%s,%s,%s)", p, q, r);
            return true;
        }
        return false;
    }

}
