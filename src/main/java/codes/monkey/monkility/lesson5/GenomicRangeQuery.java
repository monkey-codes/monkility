package codes.monkey.monkility.lesson5;

import java.util.HashMap;

/**
 * Created by jzietsman on 4/8/16.
 * This took several attempts before figuring out how to apply prefix sums.
 * https://codility.com/demo/results/trainingP3PGVC-4UT/
 */
public class GenomicRangeQuery {


    public int[] solution(String S, int[] P, int[] Q) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);
        int[][] prefix = new int[S.length()][4];
        char[] dna = S.toCharArray();
        int[] results = new int[P.length];

        for (int i = 0; i < dna.length; i++) {
            if (i > 0) {
                System.arraycopy(prefix[i-1],0, prefix[i],0, prefix[i].length);
            }

            prefix[i][map.get(dna[i])]++;
        }


        for (int r = 0; r < results.length; r++) {
            int[] upper = prefix[Q[r]];
            int[] lower = prefix[P[r]];
            for (int i = 0; i < 4; i++) {
                if (upper[i] - lower[i] > 0 || map.get(dna[P[r]]) == i ) {
                    results[r] = i + 1;
                    break;
                }
                results[r] = map.get(dna[P[r]]) +1;
            }
        }

        return results;
    }


}
