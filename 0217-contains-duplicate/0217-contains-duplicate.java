class Solution {
    public boolean containsDuplicate(int[] nums) {
                HashSet hashSet = new HashSet();
        for (int i = 0; i <= nums.length -1; i++) {
            if (hashSet.contains(nums[i])) {
                return true;

            } else {
                hashSet.add(nums[i]);
            }
        }
        return false;

        
    }
}