import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "ayush kumar singh";
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(STR."\{entry.getKey()} : \{entry.getValue()}");
        }
    }
}
