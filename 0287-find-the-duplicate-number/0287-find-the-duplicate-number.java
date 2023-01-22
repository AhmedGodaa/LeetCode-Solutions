class Solution {
    public int findDuplicate(int[] nums) {
    HashSet hash = new HashSet();
        int temp = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (hash.contains(nums[i])) {
                temp = nums[i];

            } else {
                hash.add(nums[i]);

            }
        }
        return temp;
        
    }
}