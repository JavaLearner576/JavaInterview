package Question.leetcode;

/**
 * Created by gump on 2017/5/19.
 */
public class Q123 {
    public int maxProfit(int[] prices) {
        int hold1 = Integer.MIN_VALUE;
        int hold2 = Integer.MIN_VALUE;
        int release1 = 0;
        int release2 = 0;

        for (int i :prices) {
            release2 = Math.max(release2,hold2+i);
            hold2 = Math.max(hold2,release1-i);
            release1 = Math.max(release1,hold1+i);
            hold1 = Math.max(hold1,-i);
        }
        return release2;
    }
}
