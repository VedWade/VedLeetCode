// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         Integer [] res = new Integer[nums.length];

//         for( int i =0;i<nums.length;i++) {
//             res[i] = nums[i];
//         }

//         Arrays.sort(res, (val1,val2)->Integer.compare(val1%2, val2%2));

//          for( int i =0;i<nums.length;i++) {
//             nums[i] = res[i];
//         }

//         return nums;
        
//     }
// }
class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int [] res = new int[nums.length];

        int j =0;

        for(int i =0;i<nums.length;i++) {
            if(nums[i] % 2 == 0){
                res[j] = nums[i];
                j++;
            }
        }

        for(int i =0;i<nums.length;i++) {
            if(nums[i] % 2 == 1){
                res[j] = nums[i];
                j++;
            }
        }

        return res;
      
    }
}