//
// Created by EGYPT_LAPTOP on 10/26/2022.
//

#ifndef CPP_ALTERNATINGCURRENT_H
#define CPP_ALTERNATINGCURRENT_H

#include <iostream>
#include "stack"
#include "string"

using namespace std;

int alternatingCurrent() {
    stack<char> stack;
    string exp;
    cin >> exp;
    for (int i = 0; i < exp.length(); i++) {
        if (stack.empty()) {
            stack.push(exp[i]);
        } else {
            if (stack.top() == exp[i]) {
                stack.pop();
            } else {
                stack.push(exp[i]);
            }

        }

    }
    if (stack.empty()) {
        cout << "Yes";
    } else {
        cout << "No";
    }


}

#endif //CPP_ALTERNATINGCURRENT_H
