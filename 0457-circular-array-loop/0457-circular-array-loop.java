class Solution {

    public int calcNextIdx(int[] nums, int curr) {
        int next = curr;
        int seq = nums[curr];

        if (seq > 0) {
            // [2, -1, -1, 2, 2]
            // 0. 1. 2. 3. 4
            next = (next + seq) % nums.length;

        } else {
            // mod with negatives
            // java
            // 8
            // 4
            // 0 1 2 3 4 5 6 7
            // -5
            // move forward 3 steps
            // -5 + 8 = 3
            // len of the nums
            // move curr by 3 steps
            // -10% 8-> -2

            int mod = seq % nums.length;
            int forward = nums.length + mod;

            next = (curr + forward) % nums.length;
        }

        return next;
    }

    public boolean circularArrayLoop(int[] nums) {

        // seq, k > 1, all positives or all negatives
        // check for all indexes

        for (int i = 0; i < nums.length; i = i + 1) {

            // set -> indexes that we have visited so far
            // flag -> is Pos = nums[i] > 0

            // [1, 1, 1, 1, -1]
            // 0. 1. 2. 3. 4

            // T: O(n^2), S: O(n)

            Set<Integer> set = new HashSet<>();

            set.add(i);

            boolean isPos = nums[i] > 0;
            int curr = i;

            // cycle detection
            // [2, -1, 1, 2, 2]
            // 0. 1. 2. 3. 4
            // C
            // n
            // { 0, 2, 3 }

            // T: O(), S: O()

            while (true) {

                int next = calcNextIdx(nums, curr);

                if (isPos) {

                    if (nums[next] < 0) {
                        break;

                    } else {

                        if (set.contains(next)) {

                            // cycle is there
                            // k > 1

                            if (curr != next) {
                                return true;
                            } else {
                                break;
                            }

                        } else {
                            set.add(next);
                        }
                    }

                } else {

                    if (nums[next] > 0) {
                        break;

                    } else {

                        if (set.contains(next)) {

                            // cycle is there
                            // k > 1

                            if (curr != next) {
                                return true;
                            } else {
                                break;
                            }

                        } else {
                            set.add(next);
                        }
                    }
                }

                curr = next;
            }
        }

        return false;
    }
}