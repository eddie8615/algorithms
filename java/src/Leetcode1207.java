import java.util.*;

public class Leetcode1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int valueSize = map.values().size();
        int setSize = new HashSet<>(map.values()).size();

        if(valueSize == setSize)
            return true;
        else
            return false;
    }
}
