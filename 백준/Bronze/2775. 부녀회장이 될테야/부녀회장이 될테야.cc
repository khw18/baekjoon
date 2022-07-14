#include <iostream>

using namespace std;

int getNum(int a, int b) {
    if(b == 1)
        return 1;
    if(a == 0)
        return b;
    return getNum(a-1,b) + getNum(a,b-1);
}

int main() {
    int t;
    cin >> t;
    while(t--) {
        int k, n;
        cin >> k >> n;
        cout << getNum(k,n) << endl;
    }
}