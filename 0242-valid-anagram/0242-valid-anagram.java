class Solution {
    public boolean isAnagram(String s, String t) {
//                boolean ans = true;
//         Set<Character> set = new HashSet<>();

//         if (s.length() != t.length()) {
//             return false;
//         }
//         for (int i = 0; i < s.length(); i++) {
//             set.add(s.charAt(i));
//         }
//         for (int i = 0; i < t.length(); i++) {
//             if (set.contains(t.charAt(i))) {
//                 ans = ans && true;
//             } else {
//                 ans = ans && false;
//             }
//         }

//         return ans;

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if (Arrays.equals(first, second)) {
            return true;
        }


        return false;

    }
}