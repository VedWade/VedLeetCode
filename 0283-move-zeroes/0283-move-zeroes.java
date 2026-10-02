// class Solution {
//     public void moveZeroes(int[] nums) {

//         int [] temp = new int[nums.length] ;
//         int j =0 ;

//         for(int i =0;i<=nums.length-1;i++){
//             if(nums[i]!=0){
//                 temp[j]=nums[i];
//                 j++;
//             }
            
//         }
//         for(int i =0;i<nums.length;i++) {
//             nums[i]=temp[i];
//         }
//     }
// }
class Solution {
    public void moveZeroes(int[] nums) {

       int slow =0;
       int fast =0;

      while(fast<nums.length){
        if(nums[fast]==0){
            fast++;
        }
        else{
            nums[slow] =nums[fast];
            slow++;
            fast++;
        }
      }
      while(slow<nums.length){
        nums[slow] = 0;
        slow++;
      }
    }

}