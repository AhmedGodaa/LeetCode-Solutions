//
// Created by EGYPT_LAPTOP on 10/22/2022.
//
#include <iostream>


#define ll long long

using namespace std;

void trickySum() {
    ll t, sum, n, ans;
    cin >> t;


    while (t--) {
        cin >> n;
        sum = n * (n + 1) / 2;
        ll z = 1;
//        Start from one and multiply 1 2 4 16 to get 2 multiplication;
        ll pSum = 0;
        while (z <= n) {
            pSum += z;
            z = z * 2;


        }
        ans = sum - 2 * pSum;
        cout <<  ans << endl ;


    }



}
