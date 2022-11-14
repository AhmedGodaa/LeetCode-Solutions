class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
          map<int, int> mymap;

    for (int i: nums) {
        mymap.insert({i, 0});
        
    }
    vector<int> result;


        nums.clear();

    for (auto ele: mymap) {
        nums.insert(nums.end(),ele.first);

    }
    return  mymap.size();
        
    }
};