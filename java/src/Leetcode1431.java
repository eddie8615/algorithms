import java.util.*;

public class Leetcode1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int largest = 0;
        for(int i : candies){
            largest = Math.max(largest, i);
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= largest)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
