//using hashsets -> got unsorted and unique values

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) 
    {
        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.err.println(nums);
    }
}
