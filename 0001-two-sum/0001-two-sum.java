class Solution {
    public int[] twoSum(int[] nums, int target) {
                int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            for (int y = i + 1; y < nums.length; y++) {
                if (x + nums[y] == target) {
                    result[0] = i;
                    result[1] = y;


                }


            }
        }
        return result;

    }
}