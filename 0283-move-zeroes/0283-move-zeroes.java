class Solution {
    public void moveZeroes(int[] nums) {
                int ball = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ball++;
            } else {
                current = nums[i];
                nums[i] = 0;
                nums[i - ball] = current;

            }


        }
    }
}