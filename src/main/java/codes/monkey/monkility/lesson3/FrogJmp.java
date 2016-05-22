package codes.monkey.monkility.lesson3;

/**
 * Created by jzietsman on 3/23/16.
 * https://codility.com/demo/results/trainingBK64Z6-Y6D/
 */
public class FrogJmp {

    public int solution(int locatedAt, int target, int jump) {
        int requiredDistance = target - locatedAt;
        int i = requiredDistance / jump;
        return requiredDistance % jump > 0 ? i + 1 : i;
    }
}
