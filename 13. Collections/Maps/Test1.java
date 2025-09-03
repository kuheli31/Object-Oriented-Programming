
import java.util.HashMap;
import java.util.Map;

//Maps to get keys and values

public class Test1 {
    public static void main(String[] args) {
        
        Map<String , Integer> students = new HashMap<>();
        students.put("Koyel" , 100);
        students.put("Durjoy", 50);

        System.out.println(students);
        System.out.println(students.get("Durjoy"));
    }
}
