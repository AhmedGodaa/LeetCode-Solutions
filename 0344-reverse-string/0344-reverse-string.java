class Solution {
    public void reverseString(char[] s) {
           Stack<Character> stack = new Stack<>();
        for (char f : s) {
            stack.push(f);
        }
     
       while (!stack.isEmpty()) {
            s[s.length - stack.size()] = stack.pop();
        }
        
    }
}