#include "iostream"
#include "stack"
#include "string"
class Solution {
public:
    bool isValid(string s) {
       stack<char> stack;
    for (int i = 0; i < s.length(); i++) {
        if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
            stack.push(s[i]);

        } else if (s[i] == ')' || s[i] == '}' || s[i] == ']') {
            if (stack.empty() || !arePair(stack.top(),s[i])) {
                return false ;

            } else {
                stack.pop();

            }

        }
    }
    if (stack.empty()){
        return true ;

    } else{
       return false;


    }
        
    }
    bool arePair(char open, char close) {
    if (open == '(' && close == ')') {
        return true;
    } else if (open == '{' && close == '}') {
        return true;
    } else if (open == '[' && close == ']') {
        return true;
    } else {
        return false;
    }


}
};