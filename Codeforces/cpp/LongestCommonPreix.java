class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        String firstString = strs[0];
        String lastString = strs[strs.length - 1];


        while (firstString.indexOf(lastString) != 0) {
            lastString = lastString.substring(0, lastString.length() - 1);


        }
        return lastString;

    }
}