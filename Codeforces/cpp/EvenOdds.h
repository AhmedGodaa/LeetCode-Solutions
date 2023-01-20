//
// Created by EGYPT_LAPTOP on 10/22/2022.
//

#ifndef CPP_EVENODDS_H
#define CPP_EVENODDS_H
#define ll long long

#include "iostream"

using namespace std;

void evenOdds() {
    ll x, y, ans, mid;
    cin >> x >> y;
    if (x % 2 == 0) {
        mid = x / 2;
        if (y > x / 2) {
            ans = (y - (mid)) * 2;

        } else {
            ans = (y * 2) - 1;
        }
    } else {
        mid = (x + 1) / 2;
        if (y > mid) {
            ans = (y - (mid)) * 2;

        } else {
            ans = (y * 2) - 1;
        }


    }
    cout << ans;


}

#endif //CPP_EVENODDS_H
