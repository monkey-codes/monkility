package codes.monkey.monkility.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
//https://codility.com/demo/results/trainingCXJDMA-E44/
public class MaxProductOfThree {
    public int solution(int[] ints) {
        Arrays.sort(ints);
        int last = ints.length - 1;
        List<List<Integer>> tesCoords = new ArrayList<>();
        tesCoords.add(asList(0, 1, 2));
        tesCoords.add(asList(last, last - 1, last - 2));
        tesCoords.add(asList(0, 1, last));
        tesCoords.add(asList(0, last - 1, last));

        int solution = Integer.MIN_VALUE;
        for (List<Integer> coordinate : tesCoords) {
            int result = ints[coordinate.get(0)] * ints[coordinate.get(1)] * ints[coordinate.get(2)];
            solution = (result > solution) ? result : solution;
        }

        return solution;
    }
}
