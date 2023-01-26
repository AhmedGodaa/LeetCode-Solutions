class Solution {
    public int thirdMax(int[] nums) {
            Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        if (set.size() >= 3) {
            set.remove(Collections.max(set));
            set.remove(Collections.max(set));

        }
        int x = Collections.max(set);
        return x;

    }
}