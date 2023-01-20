#include "iostream"
#include "vector"
#include "string"
#include "unordered_map"
#include "map"
#include "algorithm"

using namespace std;

int removeDuplicatesFromSortedArray() {
    vector<int> nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    map<int, int> mymap;

    for (int i: nums) {
        mymap.insert({i, 0});
    }

    nums.clear();

    for (auto ele: mymap) {
        nums.insert(nums.end(), ele.first);

    }
    return mymap.size();

}


