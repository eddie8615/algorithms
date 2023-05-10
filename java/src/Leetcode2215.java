import java.util.*;
import java.util.stream.*;


public class Leetcode2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> nums1_ans = new ArrayList<>();
        List<Integer> nums2_ans = new ArrayList<>();

        for(int i : set1){
            if(!set2.contains(i))
                nums1_ans.add(i);
        }
        for (int i : set2){
            if(!set1.contains(i))
                nums2_ans.add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(nums1_ans);
        ans.add(nums2_ans);
        return ans;
    }
}
