class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                Map<Integer, Integer> hashMap = new HashMap<>();
//        Map<Integer, Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.merge(nums[i], 1, Integer::sum);
        }

        var ref = new Object() {
            int counter = 0;
        };
        int[] result = new int[k];
//        hashMap.forEach((key, value) -> System.out.println(key + " " + value));
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> {
            if (ref.counter < k) {
                result[ref.counter] = x.getKey();
                ref.counter++;
            }
        });

        return result;


        
    }
}