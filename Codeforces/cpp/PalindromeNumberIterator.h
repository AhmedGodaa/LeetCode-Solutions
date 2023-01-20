#include "iostream"
using namespace std;
#include "vector"

bool isPalindrome(int x) {
    string number = to_string(x);
    vector<char> vect(number.begin(), number.end());
    auto rit = vect.rbegin();
    int i = 0;
    bool temp;

    for (; rit != vect.rend(); rit++) {
        if (vect[i] == *rit) {
            temp = true;
        } else {
            temp = false;
            break;

        }
        i++;
    }
    return temp;
}

