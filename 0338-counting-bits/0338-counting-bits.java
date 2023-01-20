class Solution {
    public int[] countBits(int n) {
               int[] intArr = new int[n + 1];


        for (int i = 0; i <= n; i++) {
            int temp = i;
            int couter = 0;
            while (temp > 0) {
                if (temp % 2 != 0) {
                    couter++;
                }
                temp = temp / 2;
            }
            intArr[i] = couter;

        }
        return intArr;


        
    }
}