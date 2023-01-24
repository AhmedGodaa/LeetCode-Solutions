class Solution {
    public List<String> removeAnagrams(String[] words) {
      String previous = "";
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length ; i++) {
            char[] charArr = words[i].toCharArray();
            Arrays.sort(charArr);
            String current = String.valueOf(charArr);
            if (!previous.equals(current)) {
                result.add(words[i]);

            }

            previous = current;
        }


        return result;
    }
}