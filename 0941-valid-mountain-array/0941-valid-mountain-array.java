class Solution {
    public boolean validMountainArray(int[] arr) {

        int i = 0;
        int j = i + 1;

        // Increasing
        while (i < arr.length - 1) {

            if (arr[i] < arr[j]) {
                i++;
                j++;
            } else {
                break;
            }
        }

        // Peak cannot be first or last
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        // Decreasing
        while (i < arr.length - 1) {

            if (arr[i] > arr[j]) {
                i++;
                j++;
            } else {
                break;
            }
        }

        return i == arr.length - 1;
    }
}