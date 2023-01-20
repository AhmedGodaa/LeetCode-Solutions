//
// Created by EGYPT_LAPTOP on 10/22/2022.
//

#ifndef CPP_BIT_H
#define CPP_BIT_H

#include <iostream>
using namespace std;
void bit(){
    int n ;
    string info ;
    int counter = 0;
    cin >> n ;

    for (int i=0 ;i<n ;i++){
        cin >> info;

        if(info == "X++" || info == "++X" ){
            counter += 1;
        };
        if(info == "X--" || info == "--X" ){
            counter -= 1;
        };

    }

    cout << counter ;
}

#endif //CPP_BIT_H
