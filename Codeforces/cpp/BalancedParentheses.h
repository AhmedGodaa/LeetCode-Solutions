//
// Created by EGYPT_LAPTOP on 10/25/2022.
//

#ifndef CPP_BALANCEDPARENTHESES_H
#define CPP_BALANCEDPARENTHESES_H

#include "iostream"

using namespace std;

#include "string"
#include "stack"

bool ispair();

bool isPair();

bool isPair(char i, char i1);

int balancedParentheses() {
    stack<char> stack;
    string input;
    cin >> input;


    for (int i = 0; i < input.length(); i++) {
        if (input[i] == '(' || input[i] == '[' || '{') {
            stack.push(input[i]);

        } else if (input[i] == ')' || input[i] == ']' || '}') {
            if (isPair(input[i], input[i - 1])) {
                stack.pop();
            } else{
                cout << "not valid ";
            }

        }

    }


}

bool isPair(char open, char close) {
    if (open == '(' && close == ')') {
        return true;
    } else if (open == '[' && close == ']') {
        return true;

    } else if (open == '{' && close == '}') {
        return true;

    } else { return false; }
}


#endif //CPP_BALANCEDPARENTHESES_H
