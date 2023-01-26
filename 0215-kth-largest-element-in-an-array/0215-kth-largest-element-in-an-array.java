class Solution {
    public int findKthLargest(int[] nums, int k) {
              PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        for (int i : nums) {
            priorityQueue.add(i);

            if (priorityQueue.size() > k) {
                priorityQueue.remove();
            }
        }


        return priorityQueue.remove();
    }
}