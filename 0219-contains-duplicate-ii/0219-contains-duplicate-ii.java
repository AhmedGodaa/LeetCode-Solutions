class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //         we will use map to get the key of the first number which is position
        HashMap<Integer, Integer> map = new HashMap();
//         the value will the position and the key will be the value
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) return true;
            else {
                map.put(nums[i], i);
            }

        }
        return false;

        
    }
}