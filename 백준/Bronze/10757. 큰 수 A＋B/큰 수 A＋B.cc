#include <iostream>

using namespace std;

int main(){
    string a, b;
    cin >> a >> b;
    int tmp;
    bool carry = false;

    string sum(max(a.size(), b.size()), '0');

    for(int i = 0; i < sum.size(); i++) {
        tmp = carry;
        carry = false;

        if(i < a.size()) {
            tmp += a[a.size()-1-i]-'0';
        }
        if(i < b.size()) {
            tmp += b[b.size()-1-i]-'0';
        }

        if(tmp > 9) {
            carry = true;
            tmp -= 10;
        }
        sum[sum.size()-1-i] = tmp + '0';
    }

    if(carry) {
        sum.insert(sum.begin(), '1');
    }

    cout << sum;


}