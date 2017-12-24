import java.util.ArrayList;
import java.util.List;

public class Hailstone {
    /**
     * Compute a hailstone sequence.
     * @param n Starting number for sequence. Assumes n > 0.
     * @return hailstone sequence starting with n and ending in 1
     */
    public static List<Integer> hailstoneSequence(int n) {
        List<Integer> list = new ArrayList<Integer>();
        while (n != 1) {
            list.add(n);
            if (n%2 == 0) {
                n = n/2;
            } else {
                n = 3*n +1;
            }
        }
        list.add(n);
        return list;
    }
    public static void main(String[] args) {
        System.out.println(Hailstone.hailstoneSequence(3));
    }
}


