//
// Created by EGYPT_LAPTOP on 10/22/2022.
//

#ifndef CPP_BEARANDBIGBROTHER_H
#define CPP_BEARANDBIGBROTHER_H


//class BearAndBigBrother {
//
//
//
//public:
//    int bearAndBigBrother(int x, int y);
//
//};
using namespace std;

void bearAndBigBrother() {
    int x, y;
    int counter = 0;
    cin >> x >> y;
    while (x <= y) {
        x *= 3;
        y *= 2;
        counter += 1;
    }
    cout << counter;


}


#endif //CPP_BEARANDBIGBROTHER_H
