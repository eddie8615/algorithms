package Next_DLP;

import java.util.*;

public class GeneralProgramming2 {

    public static void main(String[] args) {
        int[] numbers = checkIntersection(new int[]{1,2,3,4,5,10}, new int[] {1,2,10,30});
        for(int i : numbers){
            System.out.println(i);
        }
    }

    private static int[] checkIntersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++)
            set1.add(nums1[i]);
        for(int j = 0; j < nums2.length; j++)
            set2.add(nums2[j]);

        set1.retainAll(set2);

        int[] result = new int[set1.size()];
        int index = 0;
        Iterator<Integer> itr = set1.iterator();

        while(itr.hasNext()){
            result[index] = itr.next();
            index++;
        }
        return result;
    }
}
