class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n =nums.length-1;
        int max = 0;

        int candidate =0;
        int i =0;

        while(i<=n) {
            if(nums[i]==1) {
                candidate = candidate + nums[i];
                max = Math.max(max,candidate);
                i++;
            }
            else {
                i++;
                candidate = 0;
            }
            
        }

        return max;

    }
}