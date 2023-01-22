class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.merge(nums[i], 1, Integer::sum);

        }
        int x = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) == 1) {
                result.add(nums[i]);

//                result[x] =
                x++;

            }
        }
        int[] resultArr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArr[i] = result.get(i);
        }
        return resultArr;
    }
}