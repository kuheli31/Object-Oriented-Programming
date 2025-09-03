//using Treeset -> got sorted and unique values

import java.util.Set;
import java.util.TreeSet;

public class Treesets {
    public static void main(String[] args) {
        Set<Integer> nums = new TreeSet<>();
        nums.add(4);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.err.println(nums);
    }
}
