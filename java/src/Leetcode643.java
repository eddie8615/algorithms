public class Leetcode643 {
    public double findMaxAverage(int[] nums, int k) {
        int largest = Integer.MIN_VALUE;
        int curr = 0;
        for(int i = 0; i < k; i++){
            curr += nums[i];
        }
        largest = curr;
        for(int i = k; i < nums.length; i++){
            curr = curr + nums[i] - nums[i - k];
            largest = Math.max(curr, largest);
        }

        return largest * (1.0) / k;
    }
}
