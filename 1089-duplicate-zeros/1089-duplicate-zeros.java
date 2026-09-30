class Solution {
    public void duplicateZeros(int[] arr) {
        int[] dest = new int[arr.length];
        int s = 0, d = 0;
        
        while (s < arr.length && d < arr.length) {
            if (arr[s] == 0) {
                dest[d] = 0;
                d++;
                // Check bounds before copying the duplicate zero
                if (d < arr.length) {
                    dest[d] = 0;
                }
            } else {
                dest[d] = arr[s];
            }
            s++;
            d++;
        }
        
        // Copy the results back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = dest[i];
        }
    }
}
