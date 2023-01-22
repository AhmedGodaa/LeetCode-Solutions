class Solution {
    public int singleNumber(int[] nums) {
         HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            if (hashSet.contains(nums[i])) {
                hashSet.remove(nums[i]);
            } else {
                hashSet.add(nums[i]);
            }

        }
        for (int i : hashSet){
            return i ;
        }
        return  0;


        
    }
}