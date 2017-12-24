import java.util.ArrayList;
import java.util.List;

public class Hailstones_List {
    public static void main(String[] args) {
        int n = 3;
        List<Integer> list = new ArrayList<>();
        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n = n/2;
            } else {
                n = 3*n + 1;
            }
        }
        list.add(n);
        System.out.println("The hail sequence is: " + list);
        int max = 0;
        for (int x : list) {
            max = Math.max(x, max);
        }
        System.out.println("The max point of this hail sequense is: " +  max);
    }
}
