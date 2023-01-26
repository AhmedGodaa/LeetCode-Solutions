class Solution {
    public void moveZeroes(int[] nums) {
              for (int z = 0; z < nums.length; z++) {
            for (int i = 0; i < nums.length - 1; i++) {
                int temp = 0;
                if (nums[i] == 0) {
                    temp = nums[i + 1];
                    nums[i] = temp;
                    nums[i + 1] = 0;

                }
            }
        }
        
    }
}