class Solution {
    public int singleNumber(int[] nums) {
      HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.merge(nums[i], 1, Integer::sum);

        }

        for (int i = 0; i < nums.length ; i++) {
            if (hashMap.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return 0;

    }
}