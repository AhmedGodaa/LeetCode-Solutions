class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
                Map<String, List<String>> map = new HashMap<>();


        for (int i = 0; i < strs.length; i++) {
            char[] abc = strs[i].toCharArray();
            Arrays.sort(abc);
            String value = strs[i];


            if (!map.containsKey(new String(abc))) {
                map.put(new String(abc), new ArrayList<>());
                map.get(new String(abc)).add(value);
            } else {
                map.get(new String(abc)).add(value);
            }

        }
        List<List<String>> gogo = new ArrayList<>();


//                    System.out.println(stringList);
        gogo.addAll(map.values());
        return gogo;

        
    }
}