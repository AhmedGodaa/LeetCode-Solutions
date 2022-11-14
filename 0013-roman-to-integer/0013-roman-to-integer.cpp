class Solution {
public:
   int romanToInt(string s) {
      int sum = 0;
    unordered_map<char, int> mapList = {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000},
    };


    for (int i = 0; i < s.size(); i++) {

        if (i + 1 < s.size() && mapList.find(s[i])->second < mapList.find(s[i + 1])->second) {
            sum = sum - mapList.find(s[i])->second;
        } else {
            sum = sum + mapList.find(s[i])->second;
        }

    }



    return sum;

}
};