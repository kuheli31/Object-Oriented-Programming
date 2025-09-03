//using List
import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(nums.get(2));
    }
}