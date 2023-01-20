class Solution {
    public boolean isPalindrome(String s) {
           s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]","");
                return palindrome(s);

    }
        static boolean palindrome(String string) {
        if (string.isEmpty() || string.length() == 1) {
            return true;
        }
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            string = string.substring(1);
            string = string.substring(0, string.length() - 1);
            return palindrome(string);
        } else {
            return false;
        }


    }
}