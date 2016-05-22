package codes.monkey.monkility.lesson5;

/**
 * Created by jzietsman on 4/8/16.
 * https://codility.com/demo/results/trainingUYP8NN-9NT/
 */
public class PassingCars {
    public int solution(int[] A) {
        int multiplier = 0;
        int limit = 1000000000;
        int passingCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0) multiplier++;
            else{
                passingCounter += multiplier;
                if(passingCounter > limit) return -1;
            }
        }
        return passingCounter;
    }
}
