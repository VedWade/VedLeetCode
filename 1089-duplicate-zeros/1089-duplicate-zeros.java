// class Solution {
//     public void duplicateZeros(int[] arr) {
//         int[] dest = new int[arr.length];
//          int s = 0, d = 0;
         
//          while (s < arr.length && d < arr.length) {
//              if (arr[s] == 0) {
//                  dest[d] = 0;
//                  d++;
//                  // Check bounds before copying the duplicate zero
//                  if (d < arr.length) {
//                      dest[d] = 0;
//                  }
//              } else {
//                  dest[d] = arr[s];
//             }
//              s++;
//              d++;
//          }
//                  // Copy the results back to the original array
//          for (int i = 0; i < arr.length; i++) {
//              arr[i] = dest[i];
//          }
//      }
//  }
 
//2nd Approach
class Solution {
    public void duplicateZeros(int[] arr) {

        int possibleZeroDups =0;
        int lastIdx = arr.length -1;

        for(int i =0;i<= lastIdx - possibleZeroDups; i++) {
            if(arr[i]==0) {
                //edge case
                if(i== lastIdx - possibleZeroDups) {
                    arr[lastIdx]=0;
                    lastIdx-=1;
                    break;
                }
                possibleZeroDups++;

            }
        }

        int newLastIdx = lastIdx - possibleZeroDups;

        for(int i = newLastIdx;i>=0;i--) {
            if(arr[i]==0) {
                arr[i+possibleZeroDups]=0;
                possibleZeroDups--;
                arr[i+ possibleZeroDups] =0;
            }
            else {
                arr[i + possibleZeroDups] = arr[i];
            }
        }

        
    }
}