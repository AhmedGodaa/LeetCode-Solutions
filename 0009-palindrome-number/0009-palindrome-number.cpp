#define ll long long

class Solution {

public:
    bool isPalindrome(int x) {
        
    ll b = 0;
    int temp = x;
    if (x < 0 ){
        return false;
    }

    while (x) {
        b =( b * 10) + (x % 10);
        x = x / 10;

    }


    if (b == temp) {
        return true;
    } else {
        return false;
    }


    }
};