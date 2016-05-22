package codes.monkey.monkility.lesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jzietsman on 3/22/16.
 * https://codility.com/demo/results/trainingMKWAE7-UV2/
 */
public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int x = 0; x < A.length; x++) {
            if (!map.containsKey(A[x])) {
                map.put(A[x], new ArrayList<>());
            }
            map.get(A[x]).add(x);
        }

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() % 2 == 1) {
                return entry.getKey();
            }
        }

        return 0;

    }

    // XORing any 2 similar number will give us zero
    // XORing Zero with any number will give us the number
    public int betterSolution(int[] A) {
        int unPairedNum = A[0];
        for (int i = 1; i < A.length; i++) {
            unPairedNum = unPairedNum ^ A[i];
        }
        return unPairedNum;

    }

}
