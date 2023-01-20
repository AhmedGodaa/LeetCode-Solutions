//
// Created by EGYPT_LAPTOP on 10/22/2022.
//

#ifndef CPP_CASEOFTHEZEROSANDONES_H
#define CPP_CASEOFTHEZEROSANDONES_H

#include "iostream"
#include "string"

#define ll long long
using namespace std;

void caseOfTheZerosAndOnes() {
    ll n, ones = 0, zeros = 0;
    string num;
    cin >> n;
    cin >> num;



    for (int i = 0; i < n; i++) {
        if (num[i] == '0') {
            zeros++;
        } else if (num[i] = '1') {
            ones++;
        } else {

        }
    }
    cout << abs(zeros - ones);


};
#endif //CPP_CASEOFTHEZEROSANDONES_H
