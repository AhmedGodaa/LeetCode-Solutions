//
// Created by EGYPT_LAPTOP on 10/24/2022.
//

#ifndef CPP_CALCULATINGFUNCTION_H
#define CPP_CALCULATINGFUNCTION_H

#include "iostream"

using namespace std;
#define ll long long

int calculatingFunctions() {
    ll n, evens = 0, odds = 0;
    cin >> n;

    if (n % 2 == 0) {
        cout << n / 2;
    } else {
        cout << ((n - 1) / 2) - n;
    }
    return 0;
}

#endif //CPP_CALCULATINGFUNCTION_H
