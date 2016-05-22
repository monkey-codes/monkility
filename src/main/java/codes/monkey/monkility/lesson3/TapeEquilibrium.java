package codes.monkey.monkility.lesson3;

/**
 * Created by jzietsman on 3/23/16.
 * https://codility.com/demo/results/trainingEKB9YF-H5T/
 */
public class TapeEquilibrium {

    public int solution(int[] A) {

        if(A.length == 2) return Math.abs(A[0] - A[1]);
        int total = sum(A, 0);
        int left =0;
        int right =0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < A.length-1; i++) {
            left += A[i-1];
            right = total - left;
            int result = Math.abs(left - right);
            min = result < min ? result : min;
        }
        return min;
    }

    int sum(int[] a, int pos){
        int total = 0;
        for (int i = pos; i <  a.length; i++) {
            total += a[i];
        }
        return total;
    }
}
