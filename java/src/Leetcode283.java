class Leetcode283{
    public void moveZeroes(int[] nums) {
        int nonZeroIdx = 0;        
        for(int i = 0; i < nums.length; i++){
            nonZeroIdx = i;
            if(nums[i] == 0){
                nonZeroIdx = findNextNonZero(nonZeroIdx, nums);
                if(nonZeroIdx < i)
                    continue;
                nums[i] = nums[nonZeroIdx];
                nums[nonZeroIdx] = 0;
            }
            // for(int j = 0; j < nums.length; j++){
            //     System.out.print(String.valueOf(nums[j]) + " ");
            // }
            // System.out.println();
        }
    }

    private int findNextNonZero(int nonZeroIdx, int[] nums){
        for(int i = nonZeroIdx; i < nums.length; i++){
            if(nums[i] != 0){
                nonZeroIdx = i;
                break;
            }                
        }
        return nonZeroIdx;
    }
}