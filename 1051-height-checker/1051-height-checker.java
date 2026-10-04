class Solution {
    public int heightChecker(int[] heights) {

        int[] res = new int[heights.length];

        for(int j=0;j<heights.length;j++){
            res[j]=heights[j];
        }


        Arrays.sort(res);
        int count =0;
        for(int i =0;i<heights.length;i++){

            if(heights[i]!=res[i]){
                count ++;
            }

        }

        return count;
    }
}