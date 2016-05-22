package codes.monkey.monkility.lesson5;

import java.util.stream.IntStream;

/**
 * Created by jzietsman on 4/8/16.
 * https://codility.com/demo/results/trainingJD6YFJ-BV2/
 */
public class CountDiv {

    public int solution(int A, int B, int K) {
        int i = B / K;
        int i1 = (A == 0)? -1 : (A -1) / K; //0 % x = 0 and should be counted
        int count = i - i1;
        return count;
    }

    public int longWay(int A, int B, int K){
        return (int)IntStream.range(A,B+1).filter(n -> n % K == 0).peek(System.out::println).count();
    }
}
