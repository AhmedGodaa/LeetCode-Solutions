#include "iostream"
#include "vector"
#include "string"
#include "algorithm"

using namespace std;


string longestCommonPrefix(vector<string> strs) {
    int n = strs.size();
    string ans = "";
    sort(strs.begin(), strs.end());
    int firstElementSize = strs[0].length();


    for (int i = 0; i < firstElementSize; i++) {
        if (strs[0][i] == strs[n - 1][i]) {
            ans += strs[0][i];
        } else {
            break;
        }
    }
    return  ans;


}


