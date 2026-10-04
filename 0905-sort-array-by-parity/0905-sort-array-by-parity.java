//1st approach
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
// 2nd approach
// class Solution {
//     public int[] sortArrayByParity(int[] nums) {

//         int [] res = new int[nums.length];

//         int j =0;

//         for(int i =0;i<nums.length;i++) {
//             if(nums[i] % 2 == 0){
//                 res[j] = nums[i];
//                 j++;
//             }
//         }

//         for(int i =0;i<nums.length;i++) {
//             if(nums[i] % 2 == 1){
//                 res[j] = nums[i];
//                 j++;
//             }
//         }

//         return res;
      
//     }
// }
//3rd approach
class Solution {
    public int[] sortArrayByParity(int[] nums) {

       int i =0,
       j= nums.length-1;

       while(i<j) {
        int mod1 = nums[i] %2, 
        mod2 = nums[j] % 2;

        if(mod1 ==1 && mod2 ==0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        if( mod1 ==0) {
            i++;
        }

        if(mod2==1) {
            j--;
        }


       }

        return nums;
      
    }
}