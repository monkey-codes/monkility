package codes.monkey.monkility.lesson6;

import java.util.Arrays;

/**
 * Created by jzietsman on 4/19/16.
 * https://codility.com/demo/results/trainingEHN8H9-B89/
 */
public class Distinct {

    public int solution(int[] ints) {
        Arrays.sort(ints);
        int counter = ints.length > 0 ? 1 : 0;
        for (int i = 1; i < ints.length; i++) {
            if(ints[i-1] != ints[i])counter++;
        }
        return counter;
    }

    public int solution2(int[] ints) {
        return Arrays.stream(ints).sorted().distinct().toArray().length;
    }

}
