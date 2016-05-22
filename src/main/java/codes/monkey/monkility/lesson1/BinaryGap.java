package codes.monkey.monkility.lesson1;


import java.util.List;
import java.util.function.Function;

import static java.lang.Integer.toBinaryString;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;

/**
 * Lesson 1
 * Created by jzietsman on 3/22/16.
 */
public class BinaryGap {

    Function<Integer, Integer> strategy = this::functional;


    public int solution(int i){
        return  strategy.apply(i);
    }

    public int imperative(int i) {

        char[] chars = Integer.toBinaryString(i).toCharArray();
        boolean foundBoundary = false;
        int largestGap = 0;
        int currentGap = 0;
        for (int j = 0; j < chars.length; j++) {

            if (chars[j] == '1') {
                if (foundBoundary) {
                    if (currentGap > largestGap) {
                        largestGap = currentGap;
                    }
                    foundBoundary = false;
                } else {
                    foundBoundary = true;
                }
            } else {
                if (foundBoundary) {
                    currentGap++;
                }
            }


        }

        return largestGap;
    }

    public int functional(int i) {
        char[] chars = toBinaryString(i).toCharArray();
        List<Integer> boundaries = range(0, chars.length)
                .filter(idx -> chars[idx] == '1')
                .boxed().collect(toList());
        return range(1, boundaries.size()).boxed()
                .map(idx -> (boundaries.get(idx) - boundaries.get(idx - 1)) - 1)
                .reduce((l1, l2) -> l1 > l2 ? l1 : l2).orElse(0);

    }
}
